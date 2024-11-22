package bai8;

import java.util.Scanner;

public class Reactangle extends Shape {
	private int length;
	private int width;

	public Reactangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reactangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Reactangle [length=" + length + ", width=" + width + "]";
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		this.length = sc.nextInt();
		System.out.println("nhap chieu rong: ");
		this.width = sc.nextInt();
	}

}
