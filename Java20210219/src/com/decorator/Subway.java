package com.decorator;

public class Subway {
	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Tuna(food);
		System.out.printf("商品: %s\n總價: %,d元\n",food.getName(),food.getPrice());
	}
}
