package com.abp.kalyan;

public class Icic implements Bank{

	@Override
	public double balance() {
		return 5000;
	}

	@Override
	public String name() {
		return "jogi";
	}
	public int age() {
		return 24;
	}

}
