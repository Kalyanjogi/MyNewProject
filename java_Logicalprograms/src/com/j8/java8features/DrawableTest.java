package com.j8.java8features;

public class DrawableTest {
	public static void main(String[] args) {
		int width=10;
		Drawable d1=()->{
			System.out.println("drawing "+  width);
		};
		d1.draw();
				
	}

}
