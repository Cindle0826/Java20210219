package com.ocp.day10;

public class Son extends Father {
	public Son() {
		super('F');
		System.out.println("Son");
	}

	@Override
	public void hobby() {
		// super.hobby();
		System.out.println("LoL");
	}

}
