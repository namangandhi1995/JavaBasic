package com.newgen.test;

class Kadane {
	public static void main(String[] args) {
		Integer[] a = { 2, 2, 3, 4, 0 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(Integer a[]) {
		int size = a.length;
		int b[] = new int[size];
		int j = 0;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				b[j++] = a[i];
			}
			if (max_ending_here < 0)
				max_ending_here = 0;

		}
		return max_so_far;
	}
}
