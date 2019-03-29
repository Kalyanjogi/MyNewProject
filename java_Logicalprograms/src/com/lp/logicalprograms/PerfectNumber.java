package com.lp.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				number = number + i;
			}
		}
		if (number == n) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");
		}
	}

}
