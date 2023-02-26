package com.keshav.solid.lsp.example;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Square();

		rectangle.setRectangle_width(10);
		rectangle.setRectangle_height(20);

		System.out.println(rectangle.calculateArea());
	}
}
