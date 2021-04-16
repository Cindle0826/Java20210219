package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


public class Set_Test {
	/*
	 * 今彩539的測試
	 */
	public static void main(String[] args) {
		get539();
	}

	public static Set get539() {
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		Random r = new Random();
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(39) + 1);
		}
//		System.out.println(lotto);
		Set set= lotto.stream().map(s -> s < 10 ? "0" + s : s).collect(Collectors.toSet());
		System.out.println(set);
//		Set<Integer> setLotto= lotto.stream().map(Integer::intValue).collect(Collectors.toSet());
//		System.out.println(setLotto);
//		System.out.println(lotto.iterator().next() < 10 ? "0" + lotto.iterator().next() : lotto.iterator().next());
		return set;
	}
}
