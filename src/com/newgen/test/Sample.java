package com.newgen.test;

public class Sample {

	public static void main(String[] args) { // TODO Auto-generated method stub

		/*
		 * int x = 2, y = 3; x = x ^ y ^ (y = x);
		 * System.out.println("After Swapping values of x and y are " + x + " " + y);
		 */

		int a[] = { 1, 2, 3, 4, 6,9, 5, 7,11 };
		int large = a[0];
		int secondlarge = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >large) {
				secondlarge = large;
				large = a[i];

			}
			else if(a[i]>secondlarge)
				secondlarge=a[i];
		}
		System.out.println(large);
		System.out.println(secondlarge);
	}
}
