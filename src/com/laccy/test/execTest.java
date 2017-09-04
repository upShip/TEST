package com.laccy.test;

import java.io.IOException;
import java.io.InputStream;

public class execTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Process ps = Runtime.getRuntime().exec("ping 192.168.1.1");
//		InputStream in = ps.getInputStream();
//        int c;
//        while ((c = in.read()) != -1) {
//            System.out.println(c);// 如果你不需要看输出，这行可以注销掉
//        }
//        in.close();
//        ps.waitFor();
		
	}

}
