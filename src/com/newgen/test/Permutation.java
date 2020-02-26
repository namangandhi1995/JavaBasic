package com.newgen.test;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	static Set<String> perm = new HashSet<String>();

	public static void main(String[] args) {
		String s = "AAC";
		// Permutation perm = new Permutation();
		System.out.println(permutat(s));
	}

	public static Set<String> permutat(String input) {
		
		if (input == null)
			return null;
		// TODO Auto-generated method stub
		else if (input.length() == 0) {
			perm.add("");
			return perm;
		}
		char init = input.charAt(0);
		String rem = input.substring(1);

		Set<String> words = permutat(rem);
		System.out.println(words);
		for (String word : words) {

			for (int i = 0; i < word.length(); i++) {
				perm.add(charinsert(word, init, i));
			}
		}
		return perm;

	}

	public static String charinsert(String str, char initial, int k) {
		// TODO Auto-generated method stub
		String begin = str.substring(0, k);
		String end = str.substring(k);
		return begin + initial + end;

	}
}
