package com.thread.selenium;

public class Main {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
	
		Thread t1 = new Thread(myRunnable);
	
		t1.start();
	
		System.out.println("SBC");
	}
}
