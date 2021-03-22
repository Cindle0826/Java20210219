package com.ocp.day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		// 加入泛型
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(100);
		set.add(80);
		set.add(90);
		set.add(null);
		// 計算總分
		Integer sum = 0;
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer next = (Integer) iter.next();
			if (next != null) {
				sum += next;
			}
		}
		System.out.println(sum);
		// 計算總分 Java 8
		Integer sum2 = set.stream().filter(s -> s != null).mapToInt(s -> (Integer) s).sum();
		System.out.println(sum2);
	}
}
