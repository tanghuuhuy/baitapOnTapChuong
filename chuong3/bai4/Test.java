package bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		BenhVien[] arr = new BenhVien[n];
		for(int i=0; i<n; i++) {
			arr[i] = new BenhVien();
			arr[i].input();
		}
		for(BenhVien x:arr) {
			System.out.println(x.toString());
		}
		BenhNhan[] a = new BenhNhan[n];
		for(int i=0; i<n; i++) {
			a[i] = new BenhNhan();
			a[i].input();
		}
		for(BenhNhan b:a) {
			System.out.println(b.toString());
		}
	}

}
