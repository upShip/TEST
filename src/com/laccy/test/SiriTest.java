package com.laccy.test;

import java.io.InputStream;
import java.util.Scanner;

public class SiriTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("hello");
		String str = "";
		while(str.indexOf("exit")==-1||str.indexOf("滚")==-1){
			str  = in.nextLine();
			if(str.indexOf("吃")!=-1){
				System.out.println("已为您查询附近餐厅");
				System.out.println();
			}else if(str.indexOf("睡")!=-1){
				System.out.println("早睡早起身体好");
				System.out.println();
			}else if(str.indexOf("去")!=-1){
				System.out.println("已为您规划最佳路线");
				System.out.println();
			}else{
				System.out.println("我不明白您的意思");
				System.out.println();
			}
		}
		System.out.println("bye");

	}

}
