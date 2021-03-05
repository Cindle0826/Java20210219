package com.ocp.day06;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiArray {
	public static void main(String[] args) {
		int[][]scores = {{100,90},{80,70},{60,50}};
//		System.out.println(scores.length);
		int sum=0;
		for(int[] score: scores) {
			for(int s:score) {
//				System.out.print(s+" ");
				sum+=s;
			}	
		}
		//請算出總分
//		System.out.println("總分"+sum);
		//Java 8
		int sum2=Stream.of(scores).flatMapToInt(f -> IntStream.of(f)).sum();
		System.out.println(sum2);
	}
}
