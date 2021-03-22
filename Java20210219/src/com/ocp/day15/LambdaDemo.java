package com.ocp.day15;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {
	public static void main(String[] args) {
		Integer[] radius = { 5, -10, 15 };
		Supplier<Double> supplier = () -> Math.PI; // supplier 供應商 供應你一個公式
		Stream.of(radius)
				.filter(s -> s > 0) // predicate filter跟if有關回傳boolean
				.mapToDouble(t -> Math.pow(t, 2) * supplier.get()) // Function 你寫的函數
				.forEach(System.out::println); // Consumer 消費者 接受並實作出來
	}
}
