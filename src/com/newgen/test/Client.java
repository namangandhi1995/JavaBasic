package com.newgen.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 3333);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello");
			dos.flush();
			dos.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
