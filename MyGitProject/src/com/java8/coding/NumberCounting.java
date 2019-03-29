package com.java8.coding;

public class NumberCounting {
	public static void main(String[] args) {
		String s="i love u kalyan";
		int count=0;
		
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i) !=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
