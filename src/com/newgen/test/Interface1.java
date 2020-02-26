package com.newgen.test;

public interface Interface1 {
	String method1();

	default void log(String str) {
		System.out.println("I1 logging::" + str);

	}

	static void log1(String str) {
		System.out.println("I1 logging::" + str);

	}
}
