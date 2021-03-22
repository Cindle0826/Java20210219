package com.ocp.day12;

public abstract class Car {
	private int weel;

	public abstract void move();

	public int getWeel() {
		return weel;
	}

	public void setWeel(int weel) {
		this.weel = weel;
	}

}
