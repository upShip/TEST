package com.laccy.test;

import java.util.UUID;

public class UUIDTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
		System.out.println(uuid);
		String a = uuid.substring(0, 5)+" "+uuid.substring(5, 10)+" "+uuid.substring(10, 15)+
				" "+uuid.substring(15, 20)+" "+uuid.substring(20, 25)+" "+uuid.substring(25, 30)+" "+
				uuid.substring(30);
		System.out.println(a);
		
	}

}
