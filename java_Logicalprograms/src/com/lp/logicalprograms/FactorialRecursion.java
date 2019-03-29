package com.lp.logicalprograms;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=fact(n);
		System.out.println(result);
		}
	public static int  fact(int n) {
		int result;
		if(n==0) { 
		result=1;
		}
		else {
			result=n*fact(n-1);
		}
			
		return result;
		
	}

}
