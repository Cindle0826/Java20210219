package com.ocp.day09;

public class Util {
	public static int add(int x,int y) {
		if(x >= 50000) {
			return x + 2*y;
		}
		//	工具類別
		return x + y;
	}
}
