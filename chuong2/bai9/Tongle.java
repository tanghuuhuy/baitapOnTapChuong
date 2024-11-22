package bai9;

import java.util.Scanner;

public class Tongle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=100; i+=2) {
			sum +=i;
		}
		System.out.println("tong so le tu 1 den 100: " + sum);
	}

}
