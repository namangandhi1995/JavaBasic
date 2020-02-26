package com.newgen.test;

public class MaxSum {

	public static int max_sum(int a[][], int m, int n) {
		int maxSum = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;

		for (int i = 0; i < m - 2; i++) {
			for (int j = 0; j < n - 2; j++) {
				sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];
				maxSum = Math.max(sum, maxSum);
			}

		}
		return maxSum;
	}

	public static void main(String[] args) {
		int a[][] = { { 0, 1, 1, 0, 2 }, { 0, 4, 5, 5, 0 }, { 4, 1, 4, 0, 0 }, { 0, 4, 5, 5, 0 }, { 4, 1, 4, 0, 0 } };
		int sum = max_sum(a, 5, 5);
		System.out.println("Max Sum is " + sum);

	}
}
