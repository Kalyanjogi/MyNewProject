package com.abp.kalyan;

public class Sbi implements Bank{

	@Override
	public double balance() {
		return 200;
	}

	@Override
	public String name() {
		return "kalyan";
	}

}
