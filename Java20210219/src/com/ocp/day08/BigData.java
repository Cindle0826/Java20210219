package com.ocp.day08;

import java.util.Date;

public class BigData {
	private String data = "我是一個大資料" + new Date(); ;
	
//	public BigData() {
//		data = "我是一個大資料" + new Date();
//	}

	@Override
	public String toString() {
		return "BigData [data=" + data + "]";
	}
	
	
}
