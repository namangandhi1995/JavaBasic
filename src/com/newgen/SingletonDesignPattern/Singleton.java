package com.newgen.SingletonDesignPattern;

public class Singleton {

	private Singleton() {
	}

	private String message;

	static Singleton single = null;

	public static Singleton getInstance() {

		if (single == null) {
			System.out.println("Single");
			single = new Singleton();

		}

		return single;

	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
