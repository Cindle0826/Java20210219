package com.ocp.day14;

public class Anonymous5 {
	public static void main(String[] args) {
		BMI bmi = (h, w) -> w / Math.pow(h / 100, 2);  //身高除以 100 的平方
		System.out.println(bmi.calc(170, 60));
	}
}
@FunctionalInterface //單一 抽象方法
interface BMI {
	double calc(double h, double w);

	default void aa() {

	}
}
