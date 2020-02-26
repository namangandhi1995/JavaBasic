package com.newgen.test;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {

		Collection c = new Collection();
		System.out.println(c.m1());
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("11");
		list.add("121");
		list.add("1331");

		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}

		System.out.println(list);

	}

	public int m1() {
		try {
			return 0;
		} catch (Exception e) {
			return 2;
			// TODO: handle exception
		} finally {
			return 3;
		}

	}
}
