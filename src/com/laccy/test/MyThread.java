package com.laccy.test;

import java.io.File;

public class MyThread implements Runnable {
	
	private String name;
	public MyThread(String name){
		this.name=name;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String path = "D:\\test";
		for(int i=1;i<65535;i++){
			File file = new File(path+File.separator+name+i);
			if(!file.exists()){
				file.mkdirs();
			}
				
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
