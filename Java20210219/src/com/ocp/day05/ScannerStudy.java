package com.ocp.day05;

import java.util.Scanner;

public class ScannerStudy {
	public static void main(String[] args) {
		Scanner sc =new Scanner("170.0 60 YUN的資料 明天 228 放假");
		double h = sc.nextDouble();
		int w = sc.nextInt();
		String s = sc.nextLine();
		System.out.println(h);
		System.out.println(w);
		System.out.println(s);
		System.out.println("請輸入任意字串...");
		Scanner any = new Scanner(System.in);
		System.out.printf("您所輸入的是: %s\n", new Scanner(System.in).nextLine());
		
	}
}
