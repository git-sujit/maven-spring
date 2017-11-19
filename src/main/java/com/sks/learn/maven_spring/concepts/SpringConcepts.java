package com.sks.learn.maven_spring.concepts;

public class SpringConcepts {

	public static void main(String[] args) {
		testPolymorphism();
		testDependencyInjection();
	}

	public static void testPolymorphism() {
		System.out.println("\n***********Validate Polymorphism in Object Creation");
		// At runtime, object determines which method to execute
		Shape s = new Triangle();
		s.draw();
		s = new Circle();
		s.draw();
	}
	public static void testDependencyInjection(){
		System.out.println("\n***********Use Dependency Injection to Create Object");
		Drawing d = new Drawing();
		d.setShape(new Triangle());
		d.drawShape();
	}
}

/**
 * Put Private Member variable
 * Generate getters & setters
 * Drawing class will never change
 * We are injecting Shape dependecny to Drawing 
 * 
 * @author ssing69
 *
 */
class Drawing{
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
	
}

abstract class Shape {
	abstract void draw();
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}
