package com.prodian.task.oops.multilevel;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void displayDetails() {
		
		System.out.println("Fullname : "+firstName+" "+lastName);
		System.out.println("Age : "+age);
		
	}
	
	
	
}
