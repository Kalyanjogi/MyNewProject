package com.abp.kalyan;

import java.util.Scanner;

public class DuplicatesinList {
	public static void main(String[] args) {
		System.out.println("Enter Array Size:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		int sumOfArraySizeAndArray=sum+n;
		System.out.println("Enter k  Value:");
		int k=s.nextInt();
		int finalValue=sumOfArraySizeAndArray*k;
		System.out.println("Out Put:::::::::"+finalValue);
		
	}

}
