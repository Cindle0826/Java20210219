package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Lab {
	public static void main(String[] args) {
		System.out.println("請輸入文字");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] array = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char i : array) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			Character value = stack.pop();
			System.out.print(value);
		}
	}
}
