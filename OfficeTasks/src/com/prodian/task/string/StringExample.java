package com.prodian.task.string;

import java.util.Scanner;

public class StringExample {
	
	public static void main(String[] args) {
		
		String string = "Aravindharaj P  ";
		
		for(int i=0;i<string.length();i++) {
			
			System.out.println(string.charAt(i));
			
		}
		int a = string.compareTo("Aravindharaj p");
		System.out.println(a);	
		
		System.out.println(string.concat("arav"));
		
		
		if(string.endsWith("P")) {
			System.out.println("Yes");
		}
		
		if(string.startsWith("A")) {
			System.out.println("11");
			System.out.println("Yes"); 
		}
		
		System.out.println(string.replace('a', 'q'));
		
		
		String[] array = string.split(" ");
		
		for(String one : array) {
			System.out.println(one);
		}
		
		System.out.println(string.toLowerCase());
		
		
	}

}
