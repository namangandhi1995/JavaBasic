package com.newgen.test;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class TheAmazinRace {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int t = s.nextInt();
		for (int k = 0; k < t; k++) {
			int n = s.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++)
				a[j] = s.nextInt();
			if (n == 1) {
				System.out.println("1");
				continue;
			}
			int backs[] = new int[n];
			int forwards[] = new int[n];

			Stack<Integer> st = new Stack<Integer>();
			st.push(0);
			for (int i = 1; i < n; i++) {
				if (a[i] <= a[st.peek()]) {

					backs[i] = i - st.peek();
					st.push(i);
				} else {

					int temp = st.pop();

					while (a[i] > a[temp]) {

						if (!st.empty()) {
							temp = st.pop();
						} else {
							break;
						}

					}

					st.push(temp);
					st.push(i);
					backs[i] = i - temp;

				}
			}

						 for(int i=0;i<n;i++){ System.out.print(backs[i]+" "); } System.out.println();
			
			// ------------------------------------------

			Stack<Integer> str = new Stack<Integer>();
			str.push(n - 1);
			// System.out.println("sss:"+st.peek());
			for (int i = n - 2; i >= 0; i--) {
				if (a[i] <= a[str.peek()]) {

					forwards[i] = str.peek() - i;
					str.push(i);
					// System.out.println(i+":"+backs[i]);
				} else {

					int temp = str.pop();

					while (a[i] > a[temp]) {

						if (!str.empty()) {
							temp = str.pop();
						} else {
							break;
						}

					}

					str.push(temp);
					str.push(i);
					forwards[i] = temp - i;
					// System.out.println("HH:"+a[i]);
					// System.out.println(str);
				}
			}

			/*
			 * for(int i=0;i<n;i++){ System.out.print(forwards[i]+" "); }
			 * System.out.println();
			 */

			long max = -1;
			int pos = -1;
			for (int i = 0; i < n; i++) {
				long sum = (backs[i] + forwards[i]) % 1000000007;
				long mult = (sum * (i + 1)) % 1000000007;

				if (max < mult) {
					max = mult;
					pos = i;
				}
			}

			System.out.println(pos + 1);

		}

	}

}
