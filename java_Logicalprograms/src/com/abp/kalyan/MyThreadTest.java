package com.abp.kalyan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadTest {
	public static void main(String[] args) {
		MyRunnable[] job= {new MyRunnable("kalyan"),
				new MyRunnable("surya"),
				new MyRunnable("kaushik")};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(MyRunnable jobs:job) {
			service.submit(jobs);
		}
		service.shutdown();
	}

}
