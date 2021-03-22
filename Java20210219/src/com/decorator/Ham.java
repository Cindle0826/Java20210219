package com.decorator;

public class Ham extends SideDish{

	public Ham(Food food) {
		super(food);
		super.name="火腿";
		super.price=30;
	}

}
