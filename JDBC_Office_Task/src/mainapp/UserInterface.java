package mainapp;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import model.Student;
import service.StudentService;

public class UserInterface {

	static int number = 1;

	public static String studentIdGenerator() {//util

		String common = "SUID2022";
		class Inside {
			public int increment() {
				return number++;
			}
		}
		Inside inside = new Inside();
		String sense = String.format("%03d", inside.increment());
		return common + sense;
	}

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		StudentService studentService = new StudentService();
		Student student;
		int choice;

		System.out.println("------------Welcome to Student Management---------");
		do {
			System.out.println();
			System.out.println("1 : View All Students");
			System.out.println("2 : Insert Student");
			System.out.println("3 : Update Student");
			System.out.println("4 : Delete Student");
			System.out.println("5 : Get StudentById");
			System.out.println("6 : Exit");

			System.out.println("-----------------------------------------------");

			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				List<Student> list = studentService.getAllStudents();

				if (!list.isEmpty()) {
					// System.out.println(list);
					for (Student stu : list) {
						System.out.println();
						System.out.println(stu);
						System.out.println();
					}
				} else {
					System.out.println("There is something wrong");
				}
				break;
			case 2:
				System.out.println("Enter the student details");
				System.out.println();
				System.out.println("Enter your first name : ");
				String firstname = scanner.next();
				System.out.println("Enter your last name : ");
				String lastname = scanner.next();
				String id = studentIdGenerator();
				System.out.println("The Auto generated Id - "+id);
				System.out.println("Enter your department name : ");
				String department = scanner.next();
				System.out.println("Enter your date of birth in yyyy-MM-dd: ");
				String dob = scanner.next();
				Date date = Date.valueOf(dob);
				System.out.println("Enter your address : ");
				String address = scanner.next();
				student = new Student(id, firstname, lastname, department, date, address);

				if (studentService.addStudent(student)) {
					System.out.println("added successfully");
				} else {
					System.out.println("something fishy"
							+ "");
				}
				break;
			case 3:
				System.out.println("Enter student id to update");
				String studId = scanner.next();

				if (studentService.updateStudent(studId)) {
					System.out.println("Updated successfully");
				} else {
					System.out.println("something went wrong");
				}

				break;
			case 4:
				System.out.println("Enter student id to delete : ");
				String stuid = scanner.next();
				boolean flag = studentService.deleteStudentByStudentId(stuid);
				if (flag) {
					System.out.println("Deleted successfully");
				} else {
					System.out.println("something went wrong");
				}
				break;
			case 5:
				System.out.println("Enter student id to get details");
				String studentId = scanner.next();
				studentService.getStudentById(studentId);
				break;
			case 6:
				// System.exit(0);
				System.out.println("---BYE---");
				break;
			default:
				System.out.println("Please choose correct number !");

			}

		} while (choice != 6);
		scanner.close();

	}
}
