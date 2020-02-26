package com.newgen.SingletonDesignPattern;

public class Caller {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Singleton single = Singleton.getInstance();
		single.showMessage();
		single.setMessage("Hello");
		System.out.println(single.getMessage());
		Singleton hello = Singleton.getInstance();
		System.out.println(hello.getMessage());
		Singleton obj = Singleton.class.newInstance();
		System.out.println("From Reflection" + obj.getMessage());
	}

}
