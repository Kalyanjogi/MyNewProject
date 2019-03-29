package com.abp.kalyan;

public class CustomThread {
	public static void main(String[] args) {
		CustomException cs=new CustomException();
		try {
			cs.validate(20);
		} catch (Exception e) {
			System.out.println("exception occures"+e);
		}
	}

}
