package com.excutors.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Car implements Callable{
	String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public Object call() throws Exception {
		System.out.println(name+Thread.currentThread().getName());
		return name;
	}
	public static void main(String[] args) {
		Car[] c= {
				new Car("audi"),
				new Car("benz"),
				new Car("morris gurrage")
		};
		ExecutorService es=Executors.newFixedThreadPool(2);
		for(Car cars:c) {
			es.submit(cars);
		}
		es.shutdown();
		
	}
	

}
