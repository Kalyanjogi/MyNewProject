package com.abp.kalyan;

public class MyRunnable implements Runnable {
    String name;
    
	public MyRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+"doing job"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
