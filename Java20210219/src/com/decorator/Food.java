package com.decorator;

public abstract class Food {
	/*
	 * 設計模式 裝飾模式
	 * 遞迴
	 * 
	 */
	protected String name;
	protected int price;
	public abstract String getName();
	public abstract int getPrice();
}
