package com.ocp.day15;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorDemo {
	/*
	 * ToIntFunction 傳一個任意型別的值T 回傳的是int
	 */
	public static void main(String[] args) {
		BinaryOperator<Integer> salary = (principleSalary, bouns) -> principleSalary + bouns;
		System.out.println(salary.apply(50000, 15000));

		Integer[] length = { 10, 20, 30 }; // 長方形的邊長
		UnaryOperator<Integer> area = (t) -> t * t; //傳入兩個同樣的型別 <T,T>
		Stream.of(length).map(area).forEach(System.out::println);//回傳一個同樣型別的T
	}
}