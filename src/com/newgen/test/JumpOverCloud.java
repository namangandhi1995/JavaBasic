package com.newgen.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpOverCloud {

	private static boolean flag;

	/*
	 * public static void main(String[] args) { int a[] = { 0 ,0, 0, 0, 1, 0 }; int
	 * n = a.length; int count = 0;
	 * 
	 * if (a[0] == 0) { count = 1; }
	 * 
	 * int i; for (i = 1; i < n - 2; i++) { if (a[i] == 0) { if (a[i + 1] == 0 &&
	 * a[i + 2] != 1) { if (i + 1 == n) { flag = true; } i++; } count++; } } if
	 * (!flag) { count++; } System.out.println("Count--" + count); }
	 */

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] a) {
		int n = a.length;
		int count = 0;
		/*
		 * if (a[0] == 0) { count = 1; }
		 */
		int i;
		for (i = 1; i < n - 2; i++) {
			if (a[i] == 0) {
				if (a[i + 1] == 0 && a[i + 2] != 1) {
					if (i + 1 == n) {
						flag = true;
					}
					i++;
				}
				count++;
			}
		}
		if (!flag) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		int[] c = new int[n];

		String[] cItems = s.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);
		System.out.println(result);

		s.close();
	}

}
