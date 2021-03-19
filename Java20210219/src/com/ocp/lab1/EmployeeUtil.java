package com.ocp.lab1;

import java.util.stream.Stream;

public class EmployeeUtil {
	//  取得所有員工薪資
	public int getAllSalary(Employee...employees) {
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
	
	//	取得所有經理(Manager)的薪資
	public int getAllSalary(Manager...managers) {
		return Stream.of(managers).mapToInt(m -> m.getSalary()).sum();
	}
	
	//	取得所有董事的薪資
	public int getAllSalary(Director...directors) {
		return Stream.of(directors).mapToInt(m -> m.getSalary()).sum();
	}
}
