package com.newgen.test;

public class sumwithwindowk {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 7, 3, 4, 5 };
		System.out.println(maxsum(arr, 3));
	}

	private static int maxsum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum = 0;
		int curr_sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		curr_sum = sum;

		for (int i = k; i < arr.length; i++) {
			curr_sum += arr[i] - arr[i - k];
			sum=Integer.max(sum, curr_sum);
		}
		return sum;
	}

}
