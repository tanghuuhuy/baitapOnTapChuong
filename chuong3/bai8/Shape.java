package bai8;

public abstract class Shape {
	protected String color;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(String color) {
		super();
		this.color = color;
	}
	public abstract double getArea();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
