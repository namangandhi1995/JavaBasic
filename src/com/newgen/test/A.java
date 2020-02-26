/* for varargs
double > float
float > long
long > int
int > char
int > short*/

package com.newgen.test;

public class A {
	public static void main(String[] args) {

		B.Inner inner = new B().new Inner();
		inner.m1(1, 2, 2);

	}
}

class B {
	class Inner {
		public void m1(String... a) {
			// TODO Auto-generated method stub
			System.out.println("A1");
		}

		public void m1(int... b) {
			// TODO Auto-generated method stub
			System.out.println("A11");
		}

	}
}
