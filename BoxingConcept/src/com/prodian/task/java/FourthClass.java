package com.prodian.task.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FourthClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ThirdClass thirdClass = new ThirdClass();

		System.out.println("First class has called here....");

		List<Product> productList = thirdClass.productList();

		// System.out.println("Data has received as List :-)");
		// System.out.println(productList);
		if (!productList.isEmpty()) {
			System.out.println("enter the price to compare : ");
			
			int checkingPrice = scanner.nextInt();  
			
			List<Product> finalList = productList.stream().filter(p -> p.price >checkingPrice).collect(Collectors.toList());

			// System.out.println(finalList);

			for (Product data : finalList) {
				
				System.out.println();
				System.out.println("Name of the Product is " + data.productName);
				System.out.println("price of the Product is " + data.price);
				System.out.println();
			
			}
		} else {
			
			System.out.println("list is empty");
		
		}
		scanner.close();
	}

}
