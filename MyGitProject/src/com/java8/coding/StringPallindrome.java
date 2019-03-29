package com.java8.coding;

public class StringPallindrome {
	public static void main(String[] args) {
		String s="madam";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s1+s.charAt(i);
			
		}
		if(s.equals(s1)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
	}

}
