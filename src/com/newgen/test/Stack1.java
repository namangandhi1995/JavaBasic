package com.newgen.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Stack1 {
	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String s1 = br.readLine();
		// String[] s = s1.split(" ");
		int[] arr = {1,2,2,1,2,3 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(0);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(0);
		arrayList.add(3);
		
		// int length = Integer.parseInt(s[0]);
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else {
				int count = map.get(arr[i]);
				map.put(arr[i], ++count);
			}
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == 0) {
				for (Entry<Integer, Integer> in : map.entrySet()) {
					if (arrayList.get(i + 1) <= in.getValue()) {
						System.out.println(in.getKey());
						break;
					}
				}
				++i;
			} else if (arrayList.get(i) == 1) {
				for (Entry<Integer, Integer> in : map.entrySet()) {
					if (arrayList.get(i + 1) == in.getValue()) {
						System.out.println(in.getKey());
						break;
					}
				}
				++i;
			}
		}
	}

}
