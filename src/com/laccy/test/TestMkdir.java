package com.laccy.test;

import java.io.File;

public class TestMkdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\test";
		for(int i=1;i<65535;i++){
			File file = new File(path+File.separator+i);
			if(!file.exists()){
				file.mkdirs();
			}
				
		}
	}

}
