package bai10;

import java.util.Scanner;

public class tinhdtvachuvihcn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai va rong hcn: ");
		int cd = sc.nextInt();
		int cr = sc.nextInt();
		int p = (cd+cr)*2;
		int s = cd*cr;
		System.out.println("chuvi hcn: " + p + " dien tic hcn: " + s);
	}

}
