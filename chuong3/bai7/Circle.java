package bai7;

public class Circle implements GeometricObject {
	protected double radius;
	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
