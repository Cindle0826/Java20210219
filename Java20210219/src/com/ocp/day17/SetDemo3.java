package com.ocp.day17;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo3 {
	public static void main(String[] args) {
		/*
		 * 新增修改快
		 */
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(2);
		tree.add(7);
		tree.add(5);
		tree.add(8);
		tree.add(3);
		tree.add(4);
		tree.add(9);
		System.out.println(tree);
		// 子集
		SortedSet<Integer> sub = (TreeSet<Integer>)tree;
		sub = sub.subSet(5, 9); //5~9 不含9
		System.out.println(sub);
		TreeSet<Integer> sub2 = (TreeSet<Integer>)tree;
		sub2 = (TreeSet<Integer>) sub2.subSet(5,true, 9,true); //如果有5到9 包含就印出
		System.out.println(sub2);
	}
}
