package com.prodian.task.java;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainForDto {

	
	private static Product convertDtoToEntity(SimpleDtoExample simpleDtoExample){
		
		Product product = new Product();
		product.setProductId(simpleDtoExample.getId());
		product.setProductName(simpleDtoExample.getName());
		product.setPrice(simpleDtoExample.getPrice());
		
		return product;
	}
	public static void main(String[] args) {
		
		List<SimpleDtoExample> list = new ArrayList<SimpleDtoExample>();
		
		list.add(new SimpleDtoExample(1,"slipper",900));
		list.add(new SimpleDtoExample(2,"shoe",4000));
		list.add(new SimpleDtoExample(3,"watch",2000));
		list.add(new SimpleDtoExample(4,"vessel",100));
		
		
		List<Product> listOfProduct = list.stream()
									      .map(dto->convertDtoToEntity(dto))
									      .collect(Collectors.toList());
											
		for(Product data : listOfProduct) {
			System.out.println();
			System.out.println("Name of the Product is "+data.productName);
			System.out.println("price of the Product is "+data.price);
			System.out.println();
		}

	}

}
