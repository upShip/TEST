package com.laccy.test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int) (Math.random()*100);
//		System.out.println(i);
		int j = i%2;
//		System.out.println(j);
		String result = (j==1?"买":"不买");
		System.out.println(result);
	}

}
