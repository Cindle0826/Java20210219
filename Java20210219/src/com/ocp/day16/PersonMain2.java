package com.ocp.day16;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class PersonMain2 {
	public static void main(String[] args) {
		Person[][] people = {
				{ new Person("John", 170.0, 60.0), new Person("Mary", 150.0, 50.0), new Person("Helen", 165.0, 80.0) }, // A班
				{ new Person("Bob", 180.0, 80.0), new Person("Yun", 168.0, 58.0) } // B班
		}; // 請印出此5人的BMI資料

//		ToDoubleFunction<Person> getBmi = p -> p.getW()/Math.pow(p.getH()/100,2);
//		DoubleUnaryOperator fBmi = bmi -> Math.round(bmi*100)/100.0;
		Stream.of(people)
				.flatMap(s -> Stream.of(s))
				.mapToDouble(p -> p.getW() / Math.pow(p.getH() / 100, 2))
				.map(bmi -> Math.round(bmi * 100)/100.0) //四捨五入
				.forEach(System.out::println);
	}
}
