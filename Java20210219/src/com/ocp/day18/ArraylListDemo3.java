package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArraylListDemo3 {
	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<Integer>();
		lotto.add(1);
		lotto.add(2);
		lotto.add(3);
		lotto.add(4);
		lotto.add(5);
		System.out.println(lotto);
		
		Set<Integer> ans = new LinkedHashSet<Integer>();
		
		for(int i = 0 ; i< 3;i++) {
			int idx = new Random().nextInt(lotto.size());
			int value = lotto.get(idx);
			lotto.remove(idx);
			ans.add(value);
//			System.out.print(value);
		}
		System.out.println(lotto);
		System.out.println(ans);
		
	}
}
