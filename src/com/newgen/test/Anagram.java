package com.newgen.test;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "namna";
		String s2 = "naanm";
		int value = 0;
		if (s1.length() != s2.length()) {
			System.out.println("nahi hai");
		} else {
			for (int i = 0; i < s1.length(); i++) {
				value = value ^ (int)s1.charAt(i);
				value = value ^ (int)s2.charAt(i);

			}
			if (value == 0) {
				System.out.println("Anagram");
			} else
				System.out.println("nahi hai");
		}

	}

}
