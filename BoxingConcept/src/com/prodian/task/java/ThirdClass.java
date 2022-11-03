package com.prodian.task.java;

import java.util.List;

public class ThirdClass {

	public List<Product> productList() {
		
		SecondClass secondClass = new SecondClass();
		
		System.out.println("Second class has called now .....  ");
		List<Product> list = secondClass.productList();
		System.out.println("sending list to main method");
		return list;
	}

}
