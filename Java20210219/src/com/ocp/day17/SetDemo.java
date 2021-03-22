package com.ocp.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo {
	public static void main(String[] args) {
		/*
		 * set元素不重複 Iterator 在起始元素 無順序性(hashCode排列) 有順序性LinkedHashSet
		 */

		Set set = new HashSet<>();
		set.add("國文");
		set.add(100);
		set.add("英文");
		set.add(90);
		set.add("數學");
		set.add(80);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		set.remove(null);
		System.out.println(set);

		/*
		 * 走訪元素 hasNext確定有沒有元素
		 */
		Iterator iter = set.iterator();
//		System.out.println(iter.hasNext() + ":" + iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());

//		while (iter.hasNext()) {
//			Object next = iter.next();
//			if (next instanceof String) { // instanceof比較型別
//				System.out.println(next);
//			}
//		}
		// 計算總分
		System.out.println("---------------");
		Integer sum = 0;
		while (iter.hasNext()) {
			Object next = iter.next();
			if (next instanceof Integer) {
				sum += (int) next;
			}
		}
		System.out.println(sum);
		//Java 8 可以直接調用集合
		int sum2 = set.stream()
					.filter(s -> s instanceof Integer) //確認有沒有Integer
					.mapToInt(s -> (Integer)s) //在把原先的Object 轉換成 Integer
					.sum();
		System.out.println(sum2);
	}
}
