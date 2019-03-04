package com.lp.kalyan.corejava;

public class ReverseWords {
	public static void main(String[] args) {
		String s1="i love my country";
		String[] s=s1.split(" ");
		int len=s.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
