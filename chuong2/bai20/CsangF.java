package bai20;

import java.util.Scanner;

public class CsangF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap do(C): ");
		float c = sc.nextFloat();
		float f = (float)(c*1.8 + 32);
		System.out.println("do f: " + f);
	}

}
