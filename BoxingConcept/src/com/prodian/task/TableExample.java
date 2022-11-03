package com.prodian.task;

import java.util.Scanner;

public class TableExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int table = scanner.nextInt();
		int limit = scanner.nextInt();
		
		for(int i=1;i<limit+1;i++) {
			
			System.out.println(i+"*"+table+"="+i*table);
			
		}
	}

}
