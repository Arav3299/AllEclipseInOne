package com.prodian.task;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the number");
//		int input = scanner.nextInt();
//		for(int i=1;i<input+1;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(i);
//				
//			}
//			System.out.println();
//		}
//		
//		 int[] array = {1,2,3,4,5};
//		 
//		 for(int element:array) {
//			 System.out.println(element);
//		 }
//	
//		String s = "hi : "+"{}".format("h");
//		System.out.println(s);
		
		int a = 25;
		int total=0;
		while(a>0) {
			
			int ae = a % 10;
			total+=ae*ae;
			a=a/10;
			System.out.println(total);
		}
		
		
		
		
		 
		
		
	}

}
