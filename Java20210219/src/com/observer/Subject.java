package com.observer;

public interface Subject {
	/*
	 *	訂閱 
	 *	退訂
	 *	發送資料
	 */
	void add(Observer observer); 
	void remove(Observer observer); 
	void notifyObserver(String data); 
}
