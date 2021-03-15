package com.ocp.day08;

import java.util.Date;

public class BigData {
	private String data ;
	private String author = "YUN";
	private static String version = "1.0";
	/*
	 * 屬性初始化的值會自動放在預設建構子
	 */
	
	// 物件初始區段
	{
		if(version.equals("1.0")) {
			data = "盤中資料";
		}else {
			data = "盤後資料";
		}
	}
	
	//類別變數初始區段
	static{
		if(new Date().getTime() % 2 == 0) {
			version = "1.0";
		}else {
			version = "2.0";
		}
	}
	

	@Override
	public String toString() {
		return "BigData [data=" + data + ", author=" + author + ", version=" + version + "]";
	}


	
	
}
