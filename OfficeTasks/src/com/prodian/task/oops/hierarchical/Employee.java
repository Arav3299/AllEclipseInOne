package com.prodian.task.oops.hierarchical;

public class Employee extends Address{

	

	private String name;
	
	private int age;
	
	private String dept;
	
	public Employee(String street, String city, String zipCode,String name,int age,String dept) {
		
		super(street, city, zipCode);System.out.println("--after super emp---");
		this.name=name;
		this.age=age;
		this.dept=dept;
		 
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + " ," + super.toString() + "]";
	}

	 
	
	
}
