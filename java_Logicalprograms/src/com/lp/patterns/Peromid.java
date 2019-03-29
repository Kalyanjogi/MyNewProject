package com.lp.patterns;

import java.util.Scanner;

public class Peromid {
public static void main(String[] args) {
	/*int i;
	System.out.println("enter n:");
	Scanner sc=new Scanner(System.in);*/
	/*int n=sc.nextInt();*/
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=20/2-i;j++) {
			System.out.print("  ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("* ");
		}
	
	System.out.println(" ");
}
}
}