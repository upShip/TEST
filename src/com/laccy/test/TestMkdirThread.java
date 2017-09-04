package com.laccy.test;

public class TestMkdirThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<100;i++){
			MyThread mt = new MyThread("Thread"+i);
			Thread t = new Thread(mt);
			t.start();
		}

	}

}

