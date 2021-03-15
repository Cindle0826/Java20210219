package com.ocp.day09;

public class Salary {
	private int principalSalary; // 本薪
	private int bouns; // 獎金

	public int getMoney() {
		int money = Util.add(bouns, principalSalary);
		return money;
	}


	public Salary(int principalSalary, int bouns) {
		this.principalSalary = principalSalary;
		this.bouns = bouns;
	}

	public void getMm() {

	}

}
