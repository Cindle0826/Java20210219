package com.ocp.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SortDemo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,40,80,30,90);
		// 將及格的分數排序好的資料放入新集合中
		List<Integer> sortedAndPassList = list.stream()
				.filter(s -> s >=60)
//				.sorted() //自然排序
//				.sorted(Comparator.reverseOrder()) //反向排序
				.sorted((o1,o2) -> o1.compareTo(o2)) //o1 - o2
//				.sorted((o1, o2) -> o1 - o2)//o1 - o2
				.collect(toList()); 
		System.out.println(sortedAndPassList);
		System.out.println(list);
	}
}
