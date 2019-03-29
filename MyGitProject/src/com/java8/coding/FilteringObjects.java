package com.java8.coding;

import java.util.ArrayList;
import java.util.List;

public class FilteringObjects {
	public static void main(String[] args) {
		List<String> li=new ArrayList();
		li.add("kalyan");
		li.add("jogi");
		li.add("kumar");
		li.add("karthik");
		/*li.stream().filter(n ->n.length()>5 )*/
		li.stream().filter(n->n.contains("k"))
		.forEach(n->System.out.println(n));
	}

}