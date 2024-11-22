package bai7;

import java.util.Scanner;

public class Nhaptinhvasosanh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap 2 so thuc: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("nhap ky tu: A || S || M || D");
		char c = Character.toUpperCase(sc.next().charAt(0));
		switch(c) {
		case 'A' :
			float sum = a + b;
			System.out.println("tong = " + sum);
		case 'S' : 
			float hieu = a - b;
			System.out.println("hieu = " + hieu);
		case 'M':
			System.out.println("tich = " + a*b);
		case 'D':
			float thuong = a/b;
			System.out.println("thuong = " + thuong);
		}
		if(c !='A' || c !='S' || c != 'M' || c != 'D') {
			System.out.println("ky tu khong hop le");
		}
	}

}
