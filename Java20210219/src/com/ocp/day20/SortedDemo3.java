package com.ocp.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortedDemo3 {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("A",100),
				new User("B",40),
				new User("C",80),
				new User("D",30),
				new User("E",90)
				);
		System.out.println(users);
		//請按照分數大小排序並置入一個新集合中
		List<User> list = users.stream()
				.sorted((u1,u2) -> u1.getScore()-u2.getScore())
				.collect(toList());
		System.out.println(list);
		//請按照分數由小到大排序並置入一個新集合中
		List<User> list_sorted = users.stream()
//				.sorted(Comparator.comparingInt(s -> s.getScore()))
//				.sorted(Comparator.comparing(User::getScore))
				.sorted((Comparator.comparing(User::getScore)).reversed()) //排序完在反轉變成 由小到大
				.collect(toList());
		System.out.println(list_sorted);
	}
}
