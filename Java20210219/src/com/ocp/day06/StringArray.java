package com.ocp.day06;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		String[] student = {"John","70"};
		UpdateScore(student);
		System.out.println(Arrays.toString(student));
	}
	
	public static void UpdateScore(String[] s) {
		s[1]="90";
	}
}
