package com.ocp.day08;

public class Book {
	private int pages;
	// 物件成員
	public int getPages() {
		return 100;
	}

	// 類別成員
	public static String getPublich() {
		return "GJUN";
	}
	
	public Book(int pages) {
		this.pages = pages;
	}
}
