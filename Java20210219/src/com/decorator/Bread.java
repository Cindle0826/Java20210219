package com.decorator;

public class Bread extends Food{
	public Bread() {
		name = "麵包";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}
}
