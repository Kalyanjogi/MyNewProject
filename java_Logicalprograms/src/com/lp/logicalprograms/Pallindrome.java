package com.lp.logicalprograms;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("enter n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp = n;
		while(n>0) {
			int Reminder=n%10;
			sum=sum*10+Reminder;
			n=n/10;
		}
		n=temp;
		if(sum==n) {
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}

}
