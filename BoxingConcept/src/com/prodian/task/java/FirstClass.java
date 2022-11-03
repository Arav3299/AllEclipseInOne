package com.prodian.task.java;

import java.util.ArrayList;
import java.util.List;

public class FirstClass {
	
	static List<Product> list = new ArrayList<Product>();
	
	public FirstClass(){
		
		System.out.println("Values getting intialised");
		
		Product product1 = new Product(1,"shoe",2000);
		list.add(product1);
		Product product2 = new Product(2,"slipper",3100);
		list.add(product2);
		Product product3 = new Product(3,"magazine",5000);
		list.add(product3);
		Product product4 = new Product(4,"watch",6000);
		list.add(product4);
		Product product5 = new Product(5,"pant",7000);
		list.add(product5);
	}
	 
	
	
	
	public List<Product> productList() {
		
		System.out.println("sending list to second class");
		return list;
		
	}

}
