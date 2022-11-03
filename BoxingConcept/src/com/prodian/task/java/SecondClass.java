package com.prodian.task.java;

import java.util.List;

public class SecondClass {
	
	FirstClass firstClass = new FirstClass();

	public List<Product> productList() {
		
		System.out.println("Third class has called here.....");
		
		List<Product> list = firstClass.productList();
		
		System.out.println("sending list to first class .....");
		return list;
		
	}

}
