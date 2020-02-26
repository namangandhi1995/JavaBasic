package com.newgen.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code {

	public static void main(String str[]) throws IOException {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		 * length = Integer.parseInt(br.readLine()); String name = br.readLine() + " ";
		 * char[] input = name.toCharArray(); name = ""; int i = 0;
		 * 
		 * while (i < length) { if (input[i] == input[i + 1]) { i = i + 2; } else { name
		 * += input[i]; i++; } } System.out.println(name.length());
		 * System.out.println(name);
		 */
		// Consumer<T>
		// Supplier<T>
		// Function<T, R>
		// LinkedList<E>

		Map<String, String> k = new HashMap<String, String>();
		k.put("1", "value");
		k.put("2", "value1");

		for (Map.Entry<String, String> g : k.entrySet()) {
			System.out.println(g.getKey() + "-" + g.getValue());
		}
	}

}
