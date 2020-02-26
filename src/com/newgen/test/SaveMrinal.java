package com.newgen.test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class SaveMrinal {

	private static Scanner s;

	public static void main(String[] args) throws NumberFormatException, IOException {
		s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int x, y;
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			x = s.nextInt();
			y = s.nextInt();

			HashSet<Integer> Hs = new HashSet<Integer>();
			for (int j = x - 1; j < y; j++) {
				Hs.add(arr[j]);
			}
			System.out.println(Hs.size());
		}
	}

}
