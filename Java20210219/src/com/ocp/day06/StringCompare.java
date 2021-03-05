package com.ocp.day06;

public class StringCompare {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		String s5 = "JaVa";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.intern() == s3); //把s1丟到字串池裡面
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s4.toUpperCase() == s5.toUpperCase()); //先轉大寫在比較
		System.out.println(s4.toLowerCase().equals(s5.toLowerCase()));//先轉小在比較
	}
}
