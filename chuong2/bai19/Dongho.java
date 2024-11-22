package bai19;

import java.util.Scanner;

public class Dongho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gio(1-12): " ); int gio = sc.nextInt();
		System.out.println("nhap phut(0-60): " ); int phut = sc.nextInt();
		System.out.println("nhap giay(0-60): " ); int giay = sc.nextInt();
		int tong = gio*3600 + phut*60 + giay;
		System.out.print("tong so giay"+ tong);
	}

}
