package com.newgen.test;

import java.util.Scanner;

public class BattleField {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int j = 0; j < n; j++) {
			int z = Integer.parseInt(s.nextLine());
			String data = s.nextLine();
			int countk = 0;
			int x = 0;
			int arr[] = new int[data.length()];
			for (int i = 0; i < data.length(); i++) {
				if (data.charAt(i) == 'K') {
					countk++;
				}
			}
			x = countk;
			int maxK = -1;
			if (data.charAt(0) == 'K')
				arr[0] = 1;
			for (int i = 1; i < data.length(); i++) {
				if (data.charAt(i) == 'K') {
					arr[i] = arr[i - 1] + 1;
				} else {
					arr[i] = arr[i - 1];
				}
			}
			for (int i = x - 1; i < data.length(); i++) {
				if (i == x - 1) {
					countk = arr[i];
				} else
					countk = arr[i] - arr[i - x];
				if (maxK < countk)
					maxK = countk;
			}
			countk = x - maxK;
			System.out.println(countk);
		}
	}
}
