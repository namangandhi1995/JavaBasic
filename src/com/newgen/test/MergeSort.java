package com.newgen.test;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 4, 3, 5, 2 };
		System.out.println(Arrays.toString(a));
		merge(a, 0, 3);
		System.out.println(Arrays.toString(a));

	}

	private static void merge(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if (i < j) {
			int m = (i + j) / 2;

			merge(a, i, m);
			merge(a, m + 1, j);
			merge(a, i, m, j);
		}
	}

	private static void merge(int[] a, int i, int m, int j) {
		// TODO Auto-generated method stub
		int n1 = m - i + 1;
		int n2 = j - m;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int k = 0; k < n1; ++k) {
			L[k] = a[k + i];
		}
		for (int l = 0; l < n2; ++l) {
			R[l] = a[l + m + 1];
		}
		int l;
		int k = l = 0;
		int r = i;
		while (l < n1 && k < n2) {
			if (L[l] <= R[k]) {
				a[r] = L[l];
				l++;
			}

			else {
				a[r] = R[k];
				k++;
			}
			r++;
		}
		while (l < n1) {
			a[r] = L[l];
			r++;
			l++;
		}
		while (k < n2) {
			a[r] = R[k];
			r++;
			k++;
		}

	}

	private static void mergea(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
