package com.ocp.day09;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("John", new Salary(30000, 5000));
		Employee e2 = new Employee("Mary", new Salary(70000, 8000));
		Employee e3 = new Employee("Helen", new Salary(50000, 6000));
		Employee[] itEmployees = { e1, e2 };
		Employee[] salesEmployees = { e2, e3 };
		
//		int sum = Stream.of(itEmployees).mapToInt(s -> s.getSalary().getMoney()).sum();
//		System.out.println(""+sum);
		IntSummaryStatistics stat = Stream.of(salesEmployees).mapToInt(s -> s.getSalary().getMoney()).summaryStatistics();
		System.out.println(stat);
//		Stream.of(salesEmployees).forEach(s -> System.out.println(s.getSalary().getMoney()));
		Stream.of(salesEmployees).forEach(s -> System.out.println("薪資"+s.getSalary().getMoney()));
	}
	
}
