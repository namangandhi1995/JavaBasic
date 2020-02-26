package com.newgen.test;

import java.util.Arrays;

public class Shallow {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		int []data;
		data=arr.clone();
		/*Method meth= new Method(arr);
		meth.name();
		arr[0]=12;
		meth.name();
		*/
		
		System.out.println(Arrays.toString(data));
	}

	
}
