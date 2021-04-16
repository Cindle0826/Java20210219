package com.ocp.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Book_ implements Comparator<Book_>{
	String name;
	Double price;
	
	
	public Book_() {
	
	}
	
	public Book_(String name, Double price) {
		this.name = name;
		this.price = price;
	}



	@Override
	public int compare(Book_ b1, Book_ b2) {
		return b1.name.compareTo(b2.name);
	}



	@Override
	public String toString() {
		return "Book_ [name=" + name + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		List<Book_> book_s = Arrays.asList(new Book_("Begining with java",2.0),new Book_("A Guild To Java Tour", 3.0));
		System.out.println(book_s);
		Collections.sort(book_s,new Book_());
		System.out.println(book_s);
		
		
	}
	
	
}