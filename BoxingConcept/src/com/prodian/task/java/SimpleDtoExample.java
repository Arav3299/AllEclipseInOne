package com.prodian.task.java;

public class SimpleDtoExample {

	
	int id;
	String name;
	private int price;
	
	
	public SimpleDtoExample() {
		 
	}

	public SimpleDtoExample(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
