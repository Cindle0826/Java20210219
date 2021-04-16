package com.ocp.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
*/
public class Homework_TwoSum {

	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(2,7,11,15);
		twoSum(num1, 9);
	}
	public static List<Integer> twoSum(List<Integer> nums, int target) {
		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {
				if(nums.get(i)+nums.get(j)==target) {
					System.out.printf("[%d %d]",i,j);
				}
			}
		}
//		Integer score[] = new Integer[nums.size()];
//		score = nums.toArray(score);
//
//		List<Integer> num1 = new ArrayList<Integer>();

//		Set<Integer> set = new HashSet<Integer>();

//		for (int i = 0; i < nums.size(); i++) {
//			for (int j = i+1; j < nums.size(); j++) {
//				if (score[i] + score[j] == target && !num1.contains(i) && !num1.contains(j)) { // 方法一
//					num1.add(i);
//					num1.add(j);

					// 方法二 利用HashSet特性不重複加
//					set.add(i);
//					set.add(j);
//					if(set.contains(i)&&set.contains(j)) { 
//						num1.add(i);
//				}
//			}
//		}

		return nums;
	}
}