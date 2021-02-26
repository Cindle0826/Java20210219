package com.ocp.day05;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo4 {
	public static void main(String[] args) {
		// 全班批次考數學的成績列表
		int[] scores1 = { 81, 90, 90, 100, 40, 50 };
		// 找出最高分與最低分
		int max = 0;

		for (int x : scores1) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println(max);
		
		int min = scores1[0];
		for (int x : scores1) {
			if(x<min) {
				min=x;
			}
		}
		System.out.println(min);
		// Java 8
		max = IntStream.of(scores1).max().getAsInt();
		min = IntStream.of(scores1).min().getAsInt();
		System.out.println("最高分 "+max);
		System.out.println("最低分 "+min);
		// Java 8 統計物件
		IntSummaryStatistics sts = IntStream.of(scores1).summaryStatistics();
		System.out.println(sts);
	}
}
