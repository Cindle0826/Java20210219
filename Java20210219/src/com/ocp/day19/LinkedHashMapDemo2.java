package com.ocp.day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<String, Integer>();
		exams.put("國文", 100);
		exams.put("數學", 80);
		exams.put("英文", 90);
		//求總分
		int sum = exams.entrySet().stream().mapToInt(s -> s.getValue()).sum();//map要先轉成entrySet才能stream
		System.out.println(sum);
	}
}
