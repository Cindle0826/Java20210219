package com.ocp.day14;

public class Anonymous4 {
	public static void main(String[] args) {
		Sub sub1 = new SubImpl();
		System.out.println(sub1.Calc(30, 20));
		/*
		 * 透過匿名內部類別
		 */
		Sub sub2 = new Sub() {

			@Override
			public int Calc(int x, int y) {
				return x - y;
			}
		};
		System.out.println(sub2.Calc(40, 10));
		/*
		 * Java 8 Lambda
		 */
		Sub sub3 = (int x, int y) -> {
			return x - y;
		};
		Sub sub4 = (int x, int y) -> x - y;
		Sub sub5 = (x, y) -> x - y; // 最精簡 省略return
		System.out.println(sub5.Calc(40, 30));
	}
}

class SubImpl implements Sub {
	/*
	 * 傳統 impl
	 */
	@Override
	public int Calc(int x, int y) {
		return x - y;
	}

}

interface Sub {
	int Calc(int x, int y);
}
