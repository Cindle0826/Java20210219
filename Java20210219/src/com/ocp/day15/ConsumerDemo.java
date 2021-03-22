package com.ocp.day15;

import java.util.function.Consumer;

public class ConsumerDemo {
	/*
	 * 消費者 Consumer 是一個interface 用accept來實作
	 * t 是傳入值 
	 * r 是回傳值
	 */
	public static void main(String[] args) {
		Integer[] radius = { 10, -5, 15 };
		Consumer<Integer> consumer1 = System.out::print; // 省略方法傳值直接實作
		Consumer<Integer> consumer2 = (t) -> System.out.println(t + ",");
		print(radius, (r) -> System.out.println(r)); // accept實作印出
		print(radius, consumer1);
		print(radius, consumer2);
	}

	public static void print(Integer[] redius, Consumer<Integer> consumer) {
		for (Integer r : redius) {
			consumer.accept(r);
		}
	}
}
