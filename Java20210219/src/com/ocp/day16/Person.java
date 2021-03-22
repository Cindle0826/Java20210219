package com.ocp.day16;

public class Person {
	private String name;
	private Double h;
	private Double w;

	public Person() {

	}

	public Person(String name, Double h, Double w) {
		this.name = name;
		this.h = h;
		this.w = w;
	}

//	@Override 手寫equals
//	public boolean equals(Object obj) {
//		if (obj instanceof Person) {
//			Person p = (Person) obj;
//			if (name.equals(p.name) && h.doubleValue() == p.h.doubleValue() && w.doubleValue() == p.w.doubleValue()) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	@Override 手寫hashcode 離散數學 兩值數相乘*物件int型別
//	public int hashCode() {
//		return 7 * 11 * name.hashCode() * h.intValue() * w.intValue();
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", h=" + h + ", w=" + w + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((h == null) ? 0 : h.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((w == null) ? 0 : w.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (h == null) {
			if (other.h != null)
				return false;
		} else if (!h.equals(other.h))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (w == null) {
			if (other.w != null)
				return false;
		} else if (!w.equals(other.w))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

}
