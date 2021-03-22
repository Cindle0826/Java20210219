package com.ocp.day17;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
	public static void main(String[] args) {
		// 集合轉Array
		Set<String> phones = new LinkedHashSet<String>();
		phones.add("pixel");
		phones.add("apple");
		phones.add("xiao mi");
		// 準備一個空字串陣列
		String[] s1 = new String[phones.size()];
		phones.toArray(s1);// 將phones 資料複製給s1
		System.out.println(Arrays.toString(s1));
		// Java8
		String[] s2 = phones.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(s2));
		String[] s3 = phones.stream().toArray(s -> new String[s]);
		System.out.println(Arrays.toString(s3));
	}
}
