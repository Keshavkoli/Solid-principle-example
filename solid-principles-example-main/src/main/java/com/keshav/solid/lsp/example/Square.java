package com.keshav.solid.lsp.example;

public class Square extends Rectangle {

	public void setWidth(int width) {
		rectangle_width = width;
		rectangle_height = width;

	}

	public void setHeight(int height) {
		rectangle_width = height;
		rectangle_height = height;
	}
}
