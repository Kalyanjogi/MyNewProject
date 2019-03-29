package com.j8.java8features;

public class Mythread {

	public static void main(String[] args) {
		Runnable r2 = () ->

		{
			System.out.println("thread is running");
		};
		Thread t1 = new Thread(r2);
		t1.start();
	}

}
