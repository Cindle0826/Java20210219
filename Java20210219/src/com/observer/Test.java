package com.observer;

public class Test {
	public static void main(String[] args) {
		Subject news = new News();
		Observer user1 = new User("Yun1");
		Observer user2 = new User("Yun2");
		Observer user3 = new User("Yun3");
		//訂閱
		news.add(user1);
		news.add(user2);
		news.add(user3);
		//發送
		news.notifyObserver("Yun寶可夢GO");
		
		//取消訂閱
		news.remove(user2);
		
		news.notifyObserver("Yun寶可夢PVP");
	}
}
