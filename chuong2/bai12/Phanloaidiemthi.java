package bai12;

import java.util.Scanner;

public class Phanloaidiemthi {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("nhap diem cua sinh vien (0-100): ");
			a = sc.nextInt();
		}
		while(a > 100 || a< 0);
		if(a >= 90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else if(a>=50) {
			System.out.println("B");
		}
		else {
			System.out.println("F");
		}
	}

}
