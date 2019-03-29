package com.abp.kalyan;

public class CustomException {
	public static void validate(int age)throws UserException{
		if(age<18) {
			throw new UserException("your not valid for vote");
		}else
		{
			System.out.println("welcome to vote");
		}
	}

}
