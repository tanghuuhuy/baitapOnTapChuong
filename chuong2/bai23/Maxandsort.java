package bai23;

import java.util.Scanner;

public class Maxandsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so sv n: "); int n = sc.nextInt();
		System.out.println("nhap diem sv (0-100): "); 
		int []a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "]");
			a[i]=sc.nextInt();
		}
		System.out.println("diem sv: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		int max = 0;
		for(int i=0; i<n; i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println("\ndiem cao nhat: " + max);
		System.out.print("sinh vien thu ");
		for(int i=0; i<n; i++) {
			if(a[i]==max) {
				System.out.print(i+1);
			}
		}
		for(int i = 0; i<n-1; i++ ) {
			for (int j=n-1; j>i; j--){
				if(a[j]<a[j-1]) {
					int tg = a[j];
					a[j-1] = a[j];
					a[j-1] = tg;
				}
			}
		}
		System.out.print("\nsx diem tang dan ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	} 


}
