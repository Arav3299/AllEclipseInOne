package com.prodian.task.thread;

public class TestThis {

	public static void main(String[] args) {
		
		ThreadExtendExample thread1 = new ThreadExtendExample();
		ThreadExtendExample thread2 = new ThreadExtendExample();
		ThreadExtendExample thread3 = new ThreadExtendExample();
		
		thread1.start();
		try {
			thread1.join();
		}catch(InterruptedException e) {
			System.out.println("something");
		}
		thread2.start();
		
		
		thread3.start();
		
		
		ThreadImplementsExample threadImplementsExample = new ThreadImplementsExample();
		
		Thread thread = new Thread(threadImplementsExample);
		
		thread.start();	

		
	}

}
