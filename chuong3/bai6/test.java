package bai6;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		PartTimeEmployee[] arr = new PartTimeEmployee[n];
		for(int i=0; i<n; i++) {
			arr[i] = new PartTimeEmployee();
			arr[i].input();
		}
		for(PartTimeEmployee x:arr) {
			System.out.println(x.toString());
		}
	}

}
