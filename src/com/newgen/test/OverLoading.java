package com.newgen.test;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading o=new OverLoading();
		o.m1(o);
	}
	
	public void m1(String m) {
		System.out.println("asdads");
	}
	
	public void m1(Object m) {
		System.out.println("asdasdasd");
	}

}
