package bai5;

import java.util.Scanner;

public class Nhapcoban {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen: ");
		int a = sc.nextInt();
		System.out.println("nhap so thuc: ");
		double b = sc.nextDouble();
		System.out.println("nhap ky tu: ");
		char c = sc.next().charAt(0);
		System.out.println("nhap chuoi ky tu: ");
		String d = sc.nextLine();
		System.out.println("so nguyen: " + a + "\n so thuc: " + b + "\n ky tu: " + c + "\n chuoi ky tu: " + d);
	}
}
