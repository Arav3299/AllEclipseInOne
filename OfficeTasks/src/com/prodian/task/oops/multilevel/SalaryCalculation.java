package com.prodian.task.oops.multilevel;

public class SalaryCalculation extends Staff{

	private int workedHours;
	
	private int workedDays;
	
	public SalaryCalculation(String firstName, String lastName, int age, String deptName, String designation, int workedHours, int workedDays) {
		super(firstName, lastName, age,deptName,designation);
		this.workedHours = workedHours;
		this.workedDays = workedDays;
	}
	
	private int calculateSalary() {
		
		return (workedHours*100)*workedDays;
		
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Worked Hours : "+workedHours);
		System.out.println("Worked Days : "+workedDays);
		System.out.println("Salary : "+calculateSalary());
	}
	
	
	
	
	
}
