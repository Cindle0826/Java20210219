package com.observer;

import java.util.ArrayList;

public class News implements Subject{
	private ArrayList<Observer> list = new ArrayList<>();

	@Override
	public void add(Observer observer) { //訂閱	
		list.add(observer);
	}

	@Override
	public void remove(Observer observer) { //退訂
		list.remove(observer);
	}

	@Override
	public void notifyObserver(String data) {
		list.forEach(o -> o.update(data));
	}
	
}
