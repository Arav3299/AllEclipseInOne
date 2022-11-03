package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import config.MyConnection;
import model.Student;

public class StudentService {

	Scanner scanner = new Scanner(System.in);
	Connection connection;

	public List<Student> getAllStudents(){
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		try {
			
			connection = MyConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from stu");
			 
			while(resultSet.next()) {
				
				Student student = new Student();
				student.setStudentId(resultSet.getString(2));
				student.setFirstName(resultSet.getString(3));
				student.setLastName(resultSet.getString(4));
				student.setDepartment(resultSet.getString(5));
				Date date = Date.valueOf(resultSet.getString("dob"));  
				student.setDateOfBirth(date);
				student.setAddress(resultSet.getString("address"));
				
				list.add(student);
				
			}
			connection.close();
			
			return list;
			
		} catch (ClassNotFoundException e) {
			 
			System.out.println(e.getMessage());
			return null;
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}

	public boolean addStudent(Student student) {

		try {

			connection = MyConnection.getConnection();
			Statement statement = connection.createStatement();
			int out = statement
					.executeUpdate("insert into stu(studentId,firstname,lastname,department,dob,address) values('"
							+ student.getStudentId() + "','" + student.getFirstName() + "','" + student.getLastName()
							+ "','" + student.getDepartment() + "','" + student.getDateOfBirth() + "','"
							+ student.getAddress() + "')");
			connection.close();
			if (out == 1) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean deleteStudentByStudentId(String stuid) {

		try {
			connection = MyConnection.getConnection();
			Statement statement = connection.createStatement();

			int out = statement.executeUpdate("delete from stu where studentId ='" + stuid + "'");
			connection.close();
			if (out == 1) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("---Message---" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("---Message---" + e.getMessage());
			return false;
		}

		return false;
	}

	public boolean updateStudent(String studId) {
		System.out.println("Enter the name to update");
		String firstname = scanner.next();

		try {
			connection = MyConnection.getConnection();
			Statement statement = connection.createStatement();
			int out = statement
					.executeUpdate("update stu set firstname='" + firstname + "' where studentId='" + studId + "'");
			if (out == 1) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("---Message---" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("---Message---" + e.getMessage());
			return false;
		}

		return false;
	}

	public void getStudentById(String studentId) {
		try {

			connection = MyConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from stu where studentId=?");
			statement.setString(1, studentId);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				System.out.println();
				System.out.println("First Name : " + resultSet.getString(3));
				System.out.println("Last Name : " + resultSet.getString(4));
				System.out.println("Department : " + resultSet.getString(5));
				Date date = Date.valueOf(resultSet.getString("dob"));
				System.out.println("Date of Birth : " + date);
				System.out.println("Address : " + resultSet.getString(7));
			} else {
				System.out.println("No data found with this id");
			}

			connection.close();

		} catch (ClassNotFoundException e) {
			System.out.println("---Message---" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("---Message---" + e.getMessage());
		}

	}

}
