
package com.newgen.test;

public class sORT {

	public static void main(String[] args) {
		int[] sampleInput = { -50, -25, -12, -3, 0, 3, 5, 45, 50, 60 };

		int n = sampleInput.length;

		int[] output = new int[n];

		int start = 0;

		int last = n - 1;

		while (last >= start) {

			n--;

			if (Math.abs(sampleInput[start]) > Math.abs(sampleInput[last])) {

				output[n] = sampleInput[start++];

			} else {

				output[n] = sampleInput[last--];

			}

		}
		for (int i : output) {
			System.out.println(i);

		}
	}

}
