package com.newgen.FactoryDesignPattern;

public class ShapeBuilder {

	public FactoryPattern shape(String name) {

		if (name == null)
			return null;

		if (name.equals("Circle"))
			return new Circle();

		if (name.equals("Rectangle"))
			return new Rectangle();
		return null;

	}

}
