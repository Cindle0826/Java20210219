package com.ocp.lab1;

import java.util.Random;
import java.util.stream.Stream;

public class EmployeeUtil {

	// 取得所有員工薪資
	public int getAllSalary(Employee... employees) {
//		// Java 7 
//		int sum = 0;
//		for(Employee e: employees) {
//			sum+=e.getSalary();
//		}
//		return sum;

		// Java 8
//		return Stream.of(employees).mapToInt(s -> s.getSalary()).sum();
		return Stream.of(employees).mapToInt(Employee::getSalary).sum();
	}

	// 取得所有經理(Manager)的薪資
	public int getAllBudget(Manager... managers) {
		return Stream.of(managers).mapToInt(m -> m.getBudget()).sum();
	}

	// 取得所有董事的薪資
	public int getAllDirector(Director... directors) {
		return Stream.of(directors).mapToInt(m -> m.getStockOptions()).sum();
	}

	// 公差一員
	public Employee getRandomEmployee() {
		int n = new Random().nextInt(3);
		switch (n) {
		case 0:
			return new Employee(38000);
		case 1:
			Manager m = new Manager(68000);
			m.setBudget(10_000);
			return m;
		default:
			Director d = new Director(88000);
			d.setBudget(50_000);
			d.setStockOptions(100_0000);;
			return d;
		}
	}

}
