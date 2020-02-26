package com.newgen.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permute {
	static Set<String> perm = new HashSet<String>();

	public static void main(String[] args) {
		String s = "AACD";
		System.out.println(permutate(s, 0, 3));

	}

	public static Set<String> permutate(String a, int l, int r) {

		// TODO Auto-generated method stub
		if (l == r) {
			// System.out.println(a);
			perm.add(a);
		} else {
			for (int i = l; i <= r; i++) {
				// swap(a.charAt(l), a.charAt(i));
				a = swap(a, l, i);
				permutate(a, l + 1, r);
				a = swap(a, l, i);
				// swap(a.charAt(i), a.charAt(l));
			}
		}
		return perm;

	}

	private static String swap(String a, int l, int i) {

		char ch[] = a.toCharArray();
		char temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;
		return Arrays.toString(ch).replaceAll(",", "").replace("[", "").replace("]", "").replace(" ", "");

	}

}
