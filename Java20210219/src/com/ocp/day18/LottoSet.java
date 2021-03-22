package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {
	public static void main(String[] args) {
		// 0~9 取出五個不重複的數字, 並放入到LinkedHashSet 集合中存放
		Random r = new Random();
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		while (lotto.size() < 5) {
			int n = r.nextInt(10);
			System.out.println("n =" + n);
			lotto.add(n);
		}
		System.out.println(lotto);
	}
}
