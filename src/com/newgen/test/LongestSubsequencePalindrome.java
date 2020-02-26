package com.newgen.test;

public class LongestSubsequencePalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("123456"));
	}

	private static String longestPalindrome(String s) {
		// TODO Auto-generated method stub

		String longestPalindrome = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			String intermediate = intermediatePalindrome(s, i, i);
			if (longestPalindrome.length() < intermediate.length()) {
				longestPalindrome = intermediate;
			}

			intermediate = intermediatePalindrome(s, i, i + 1);
			if (longestPalindrome.length() < intermediate.length()) {
				longestPalindrome = intermediate;
			}
		}
		return longestPalindrome;
	}

	private static String intermediatePalindrome(String s, int l, int r) {
		// TODO Auto-generated method stub

		if (l > r) {
			return null;
		}

		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;

		}
		return s.substring(l + 1, r);
	}

}
