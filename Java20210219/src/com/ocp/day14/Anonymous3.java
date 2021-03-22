package com.ocp.day14;

public class Anonymous3 {
	public static void main(String[] args) {
		// Lambda 適用在只有單一方法 interface , abstruct 裡面只有一個抽象方法的時候
		Add add = (int x, int y) -> System.out.println(x + y);
		add.calc(10, 20);
		// 簡化
		Add add2 = (x, y) -> System.out.println(x + y);
		add.calc(20, 30);
	}
}

interface Add {
	void calc(int x, int y);
}
