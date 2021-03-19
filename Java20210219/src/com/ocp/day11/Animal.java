package com.ocp.day11;

public interface Animal {
		String name = "動物";
		void sound();
		void sleep();
		default void Info() { // 介面的 default 實作方法 (public static) for java8
			System.out.println("小小動物世界");
		}
}
