package bai21;

import java.util.Scanner;

public class Nhapmang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu mang n: "); int n = sc.nextInt();
		System.out.println("nhap mang a: "); 
		int []a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "]");
			a[i]=sc.nextInt();
		}
		System.out.println("mang a: ");
		for(int i=0; i<n; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
