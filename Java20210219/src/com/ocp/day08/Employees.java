package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {
	private String[] employee = {"John","Mary","Helen"};
	//自行建立一個 static Employees的物件
	private static Employees _instance = new Employees();
	
	public void print() {
		Stream.of(employee).forEach(s -> System.out.println(s));
	}
	/*
	 * SingleTon 設計模式
	 * 
	 * 1.建立 private 建構子
	 * 2.自己建立一個實例static
	 * 3.提供一個public static方法來取得在 static中的實例
	 */
	
	private Employees() {
		
	}
	//提供一個 public static 方法讓外界得到你建立的唯一物件
	public static Employees getEmployess() {
		return _instance;
	}
}
