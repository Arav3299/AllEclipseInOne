package com.prodian.task.oops.hierarchical;

public class Student extends Address {

	private String name;
	
	private int age;
	
	
	
	public Student(String street, String city, String zipCode,String name,int age) {
		super(street, city, zipCode);
		this.name=name;
		this.age=age;
		 
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + " ," + super.toString() + "]";
	}



	 
	
	
	
	

}
