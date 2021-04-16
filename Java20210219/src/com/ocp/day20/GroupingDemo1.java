package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"apple","apple","banana","apple",
				"Orange", "Papaya", "Orange"
		);
		
		// output:apple=3, banana=1,orange=2,papaya=1
		
		Map<String, Long> result = names.stream().collect(Collectors.
				groupingBy(Function.identity(),Collectors.counting())); //Function.Idenity = e -> e
		System.out.println(result);
		
	}
}
