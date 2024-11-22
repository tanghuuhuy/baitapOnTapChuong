package bai6;

import java.util.Scanner;

public class toancoban {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap 2 so nguyen: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int hieu = a-b;
		float thuong = (float)a/(float)b;
  
		System.out.println("tong = " + sum);
		System.out.println("hieu = " + hieu);
		System.out.println("tich = " + a*b);
		System.out.println("thuong = " + thuong );
	}

}
