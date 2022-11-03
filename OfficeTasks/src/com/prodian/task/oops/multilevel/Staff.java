package com.prodian.task.oops.multilevel;

public class Staff extends Person{

	private String deptName;
	
	private String designation;
	
	public Staff(String firstName, String lastName, int age, String deptName, String designation) {
		super(firstName, lastName, age);
		this.deptName=deptName;
		this.designation=designation;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("DepartmentName : "+deptName);
		System.out.println("Designation : "+designation);
	}
}
