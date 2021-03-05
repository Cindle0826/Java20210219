package com.ocp.day07;

public class WrapperClassDemo {
	public static void main(String[] args) {
		/*
		 * auto-boxing 自動裝箱 auto-unboxing 自動拆箱
		 */
		int a = 100;
		Integer b = new Integer(200);
		System.out.println(a + b.intValue());// Java 5之前
		System.out.println(a + b);// Java 5之後 拆箱
		Integer c = 300; // Java 5 之後 取代 new Integer(300) 裝箱
		System.out.println(Integer.max(a, b));
		String chinese = "1";
		String math = "50";
		System.out.println(chinese + math);
		System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
		System.out.println(Integer.toBinaryString(100));

	}
}
