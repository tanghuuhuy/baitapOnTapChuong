package bai18;

import java.util.Scanner;

public class Songuyento {

	public static boolean ktrasnt(int n) {
		if(n==1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		if(ktrasnt(n)) {
			System.out.println(n + " là số nguyên tố.");
        } 
		else {
            System.out.println(n + " không phải là số nguyên tố.");
		}
	}
}
