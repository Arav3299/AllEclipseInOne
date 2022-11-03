package com.prodian.task.oops.multilevel;

public class TestSalary {

	public static void main(String[] args) {
		
		SalaryCalculation salaryCalculation = new SalaryCalculation("Karthikeyan", "P", 35, "Admin", "Super Admin", 9, 30);
		
		salaryCalculation.displayDetails();
		
		System.out.println();
		SalaryCalculation salaryCalculation1 = new SalaryCalculation("Keerthivasan", "C", 45, "Developer", "Full Stack Developer", 9,31);
		
		salaryCalculation1.displayDetails();
	}

}
