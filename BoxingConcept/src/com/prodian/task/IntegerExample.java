package com.prodian.task;

import java.util.ArrayList;

public class IntegerExample {

	public static void main(String[] args) {
		
//		int number = 123;
//		
//		Integer convertedNumber = number;
//		
//		Integer a = 123;
//		
//		System.out.println(number);
//		
//		if(convertedNumber instanceof Integer )
//		
//			System.out.println("converted Integer is "+convertedNumber);
//		
		ArrayList<Integer> array = new ArrayList<Integer>();
//		
//		array.add(convertedNumber);
//		
//		int arav = convertedNumber;
//	
//		System.out.println(arav)

		int a = 10;
		
		Integer a1 = new Integer(a);//boxing
		Integer ona = Integer.valueOf(a);//boxing
		int a2 = a1.intValue();//un boxing
		
		Integer a3 = a2;//auto boxing

		int a4 = a3;//auto deboxing or un boxing
		
//		String out = "Aravindh,raj,p";
//		
//		String[] sarray = out.split(",");
//		String output ="";
//		int i=0;
//		for(String one : sarray) {
//			
//			
//			System.out.println(one);
//			if(i==0) {
//				output+=one;
//				i++;
//			}else
//				output+=" "+one;
//			 
//		}
//		
//		System.out.println(output); 
//		
//		//String a = "a";
//		String b ="b";
//		String c = "";
//		
//	//	String[] d = {a,b,c};
//		String e = "";
//		
//		for(int j=0;j<d.length;j++) {
//			if(j==0) {
//				e+=d[j];
//			}else {
//				if(d[j].equals("")) {
//					continue;
//				}else
//					e+=","+d[j];
//			}
//		}
//		System.out.println(e);
//		
//		
	}
}
