package com.j8.java8features;

import java.util.LinkedList;
import java.util.List;

public class retirveobjects {
	public static void main(String[] args) {
		List<String>list=new LinkedList<>();
		list.add("kalyan");
		list.add("jogi");
		list.forEach((n)->System.out.println(n));
	}

}
