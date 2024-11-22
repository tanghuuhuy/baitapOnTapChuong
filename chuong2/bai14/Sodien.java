package bai14;

import java.util.Scanner;

public class Sodien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so dien: ");
		int sodien = sc.nextInt();
		int dongia = 0;
		if(sodien <= 50) {
			dongia = sodien * 1484;
		}
		else if(sodien <= 100) {
			dongia = 50*1484 + (100-sodien)*1533;
		}
		else if(sodien <= 200) {
			dongia = 50*1484 + 50*1533 + (200-sodien)*1786;
		}
		else {
			dongia = 50*1484 + 50*1533 + 100*1786 + (sodien-200)*2242;
		}
		System.out.println("tien dien phai tra: " + dongia);
	}

}
