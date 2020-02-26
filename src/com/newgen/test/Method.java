package com.newgen.test;

import java.util.Arrays;

public class Method {

	int[] data;

	public Method(int[] arr) {
	 data = arr; // shallow cloning
		// TODO Auto-generated constructor stub
		/*data = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			data[i] = arr[i];
		}*/

	}

	public void name() {
		System.out.println(Arrays.toString(data));
	}

}
