package com.prodian.task.oops.single;

public class TestIt {

	public static void main(String[] args) {
		
		//creating object for child class or sub class
		AddAndSubExample calculatorExample = new CalculatorExample();
		
		System.out.println(calculatorExample.adding(11010,-11000));
		System.out.println();
		System.out.println(calculatorExample.subracting(99999,99988));
		System.out.println();
//		System.out.println(calculatorExample.multiply(3,4));
//		System.out.println();
//		System.out.println(calculatorExample.dividing(12396,950));
		

	}

}
