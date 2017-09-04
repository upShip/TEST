package com.laccy.test;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TalkClient{

public static void main(String args[]) throws UnknownHostException, IOException {

	Socket socket=new Socket("192.168.1.126",3306);

	}

}
