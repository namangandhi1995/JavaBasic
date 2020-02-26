package com.newgen.test;

class Animal {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move() {
		// invokes the super class method
		System.out.println("Dogs can walk and run");
	}
}

public class Overriding {

	public static void main(String args[]) {
		Animal b = new Dog(); // Animal reference but Dog object
		Animal d = new Animal();
		d.move();
		b.move(); // runs the method in Dog class
	}
}