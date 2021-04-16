package com.ocp.day21;

import java.util.Scanner;

public class CircleComputer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("請輸入半徑: ");
		double r = s.nextDouble();
		double area = Math.pow(r, 2) * Math.PI;
		System.out.printf("area: %.2f\n", area);
	}
}
