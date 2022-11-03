package com.prodian.task.exception.checked;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNotFoundException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi welcome !");
		
		System.out.println("Enter the file name :");
		
		String fileName = scanner.nextLine();
		
		System.out.println("Do you want to read or write :-) if read R / write W");
		
		String operation = scanner.next();
		
		if(operation.equalsIgnoreCase("r")) {
			
			 try {
				 
				File file = new File(fileName);
				
				FileInputStream	fileInputStream = new FileInputStream(file);
				
				Scanner sfr = new Scanner(fileInputStream);
				
				while(sfr.hasNextLine())
					System.out.println(sfr.nextLine());
				
				sfr.close();
				
			} catch (java.io.FileNotFoundException e) {
				
				System.out.println("file not found !");
				
				System.out.println(e.getMessage());
			
			}finally {
				
				System.out.println("Program closed here ");
				scanner.close();
				 
			}
		
		}else if(operation.equalsIgnoreCase("w")) {
			
			System.out.println("please enter what you want to write in file : ");
			
			String input = scanner.next();
			try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			
			PrintWriter printWriter = new  PrintWriter(fileOutputStream);
			
			printWriter.println(input);
			
			printWriter.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}else {
			
			System.out.println("please enter correct one ");
		
		}
		
	}
}