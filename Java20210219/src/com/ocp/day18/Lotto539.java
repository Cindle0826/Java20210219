package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Lotto539 {
	// 樂透 5 3 9 電腦選號
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		Random r = new Random();
		while (set.size() < 5) {
			int n = r.nextInt(39) + 1;
//			System.out.println("號碼 =" + n);
			set.add(n);
		}
//		System.out.println("電腦選號" + set);
		//java 8
		
		IntStream is= set.stream().filter(s -> s.SIZE<5).mapToInt(n -> new Random().nextInt(39)+1);
		
				
	}
	
}
