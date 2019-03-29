package com.lp.logicalprograms;

import java.util.Scanner;

public class SumofNumbers {
	public static void main(String[] args) {
		System.out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int reminder = n % 10;
			sum = sum + reminder;
			n = n / 10;
		}
		System.out.println("sum of:" + sum);
	}

}
