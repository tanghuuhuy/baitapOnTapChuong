package bai13;

import java.util.Scanner;

public class Giaban {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia san pham: ");
		float cost = sc.nextFloat();
		System.out.println("nhap phan tram giam gia cua san pham: ");
		float sale = sc.nextFloat();
		float giaban = cost - sale/100*cost;
		System.out.println("gia ban sau khi giam: " + giaban);
	}

}
