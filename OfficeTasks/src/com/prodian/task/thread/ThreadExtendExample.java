package com.prodian.task.thread;

public class ThreadExtendExample extends Thread {

	public void run() {
		try {
			
		Thread.sleep(1000);
		for(int i=0;i<3;i++) {
		System.out.println("thread extending thread class");
		System.out.println(Thread.currentThread().getName());
	}
		}catch(Exception e) {
			
		}
	}
}
