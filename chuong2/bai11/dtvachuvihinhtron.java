package bai11;

import java.util.Scanner;

public class dtvachuvihinhtron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap do dai ban kinh");
		double r = sc.nextDouble();
		double p = 2*Math.PI*r;
		double s = Math.PI*r*r;
		System.out.println("chu vi htron: " + p + "\ndien tich htron: " + s);
	}

}
