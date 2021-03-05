package com.ocp.day06;

import java.util.Arrays;

public class StringArray2 {
	public static void main(String[] args) {
		String[] student = {"Join","70"};
		System.out.println(Arrays.toString(student));
		//進行學生交換
		student  = UpdateStudent();
		System.out.println(Arrays.toString(student));
	}
	
	public static String[] UpdateStudent() {
		String[] s = {"Mary","90"};
		return s;
	}
}
