package model;

import java.sql.Date;

public class Student {

	 
	
	private String studentId;
	
	private String firstName;
	
	private String lastName;
	
	private String department;
	
	private Date dateOfBirth;
	
	private String address;
	
	public Student() {
		super();
	}
	
	public Student(String studentId, String firstName, String lastName, String department, Date dateOfBirth,
			String address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}
	
	
	
	
}
