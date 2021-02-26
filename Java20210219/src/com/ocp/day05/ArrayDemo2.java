package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 全班批次考數學的成績列表
		int[] scores1 = { 80, 90, 90, 100, 40, 50 };
		System.out.printf("數學: %s\n", Arrays.toString(scores1));
		// 想要知道總分
		// Java 7 for-loop
		int sum = 0;
		for (int i = 0, lens = scores1.length; i < lens; i++) {
			sum += scores1[i];
		}
		// for迴圈 可以 "," 設變數
		System.out.printf("總分: %d\n", sum);
		// Java 7 for-in(for each)
		int sum2 = 0;
		for (int x : scores1) {
			sum2 += x;
		}
		System.out.printf("總分: %d\n", sum2);
		// 請計算平均
		double avg =(double) sum/scores1.length;
		System.out.printf("平均: %.1f\n",avg);

	}
}
