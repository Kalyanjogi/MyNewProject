package com.lp.logicalprograms;

import java.util.Scanner;

public class Febanoicseries {
	public static void main(String[] args) {
		System.out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;

			System.out.print(c);
		}
	}
}