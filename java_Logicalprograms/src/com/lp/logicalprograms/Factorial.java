package com.lp.logicalprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial:" + factorial);
	}

}
