package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 四星彩 0~9娶四個可重複的數字
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0 ; i<4;i++) {
			int n = new Random().nextInt(10);
			list.add(n);
		}
		System.out.println(list);
	}
}
