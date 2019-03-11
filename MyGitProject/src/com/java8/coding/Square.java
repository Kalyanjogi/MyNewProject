package com.java8.coding;

import java.util.function.Function;

public class Square {
	// old style coding
	/*
	 * public static int square(int n) { return n*n; }
	 */
	// by using java8
	public static void main(String[] args) {
		Function<Integer, Integer> fun = i -> i * i;
		System.out.println("square of 5:" + fun.apply(5));
	}

}
