package com.newgen.FactoryDesignPattern;

public class FactoryPatternCaller {
	
	public static void main(String[] args) {
		
		ShapeBuilder builder =new ShapeBuilder();
		
		FactoryPattern pattern=builder.shape("Rectangle");
		pattern.draw();
	}

}
