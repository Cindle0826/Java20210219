package com.ocp.lab1;

public class Employee {

	private int salary;

	public Employee() {

	}

	public Employee(int Salary) {
		setSalary(salary);
	}
	
	public void setSalary() {
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>0) {
			this.salary=salary;
		}
	}

}
