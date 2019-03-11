package com.java8.coding;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
	public static void main(String[] args) {
		List<Product>productlist=new ArrayList<Product>();
		productlist.add(new Product(1, "kalyan", "ECE"));
		productlist.add(new Product(6, "surya", "cse"));
		productlist.add(new Product(4, "charan", "mech"));
		productlist.stream().filter(Product->Product.id==6)
		          .forEach(Product->System.out.println(Product.name));
	}

}
