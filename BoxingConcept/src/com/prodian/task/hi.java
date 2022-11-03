package com.prodian.task;

public class hi {

	
	public static void main(String[] args) {
//		int x=5;
//		{
//			int y=6;
//			System.out.println(x+y);
//		}
//		System.out.println(x+y);
		int a[] = {0,2,4,1,3};
		for(int i=0;i<a.length;i++) {
			a[i]=a[(a[i]+3)%a.length];
			System.out.println(a[i]);
			
		}
	}
}
