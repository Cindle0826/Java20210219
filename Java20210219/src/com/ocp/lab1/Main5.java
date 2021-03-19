package com.ocp.lab1;

public class Main5 {
	public static void main(String[] args) {
		// 取得公差一員
		EmployeeUtil util = new EmployeeUtil();
		Employee emp = util.getRandomEmployee();
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp.getSalary());
		if (emp instanceof Manager) {
			Manager m = (Manager) emp;
			System.out.println("budget:" + m.getBudget()); // 轉型
		}

		if (emp instanceof Director) {
			Director d = (Director) emp;
			System.out.println("getStockOption:" + d.getStockOptions()); // 轉型
		}
	}
}
