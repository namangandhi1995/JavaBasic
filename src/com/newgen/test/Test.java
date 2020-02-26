package com.newgen.test;

import java.util.HashMap;
import java.util.Stack;

public class Test {/*
					 * public void LongestStrChain() {
					 * 
					 * String output = ""; ArrayList<String> words = new ArrayList<String>();
					 * words.add("ab"); words.add("bc"); words.add("cd"); words.add("de");
					 * words.add("asb");
					 * 
					 * Collections.sort(words, (o1, o2) -> o1.length() - o2.length());
					 * 
					 * for (String a : words) { System.out.println(a); }
					 * 
					 * }
					 */
	

	public static void main(String[] args) {
		char[] ab = { 'a', '{', '{', 'v', 'b', '}', '}' };

		Stack<Character> st = new Stack<Character>();

		for (char i : ab) {
			if (!st.isEmpty() && i == '}' && st.peek() == '{') {
				st.pop();
			}

			else if ((i < 'a' || i > 'z') && (i < 'A' || i > 'Z')) {
				st.push(i);

			}

		}
		System.out.println(st);
		System.out.println(st.isEmpty());
		if (st.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("UnBalaced");
		}

	}
}