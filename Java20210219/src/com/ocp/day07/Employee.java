package com.ocp.day07;

public class Employee {
	private String name;
	private String language;
	private Integer age;
	private Integer salary;
	
	public Employee() {
	
	}

	public Employee(String name, String language, Integer age, Integer salary) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
		this.salary = salary;
	}

	// 進行屬性封裝(getter/setter)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		if (salary >= 2500) {
			this.salary = salary;
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", language=" + language + ", age=" + age + ", salary=" + salary + "]";
	}
	
	//	覆寫 toString
	

}
