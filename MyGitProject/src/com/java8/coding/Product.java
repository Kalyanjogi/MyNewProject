package com.java8.coding;

public class Product {
	int id;
	String name;
	String design;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public Product(int id, String name, String design) {
		super();
		this.id = id;
		this.name = name;
		this.design = design;
	}

}
