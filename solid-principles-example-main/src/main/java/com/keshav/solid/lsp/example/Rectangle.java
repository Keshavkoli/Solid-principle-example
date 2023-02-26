package com.keshav.solid.lsp.example;

public class Rectangle {

	protected int rectangle_width;
	protected int rectangle_height;

	public int getRectangle_width() {
		return rectangle_width;
	}

	public void setRectangle_width(int rectangle_width) {
		this.rectangle_width = rectangle_width;
	}

	public int getRectangle_height() {
		return rectangle_height;
	}

	public void setRectangle_height(int rectangle_height) {
		this.rectangle_height = rectangle_height;
	}

	public int calculateArea() {
		return rectangle_width * rectangle_height;
	}
}
