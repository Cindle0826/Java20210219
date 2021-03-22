package com.ocp.day14;

public class MethodInnerClass {
	void foo() {
		int x = 1;
		int y = 2; //Java 8 自動補final
		class Hello{
			void print() {
				System.out.println(y);
			}
		}
	}
}
