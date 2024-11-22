package bai10;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HocVienDH dh = new HocVienDH();
		System.out.println("nhap thong tin hv do hoa: ");
		dh.nhaptt();
		HocVienLT lt = new HocVienLT();
		System.out.println("nhap thong tin hv lap trinh: ");
		lt.nhaptt();
		dh.intt();
		lt.intt();
	}

}
