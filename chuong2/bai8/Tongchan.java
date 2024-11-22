package bai8;

import java.util.Scanner;

public class Tongchan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		//cach1
		//for(int i = 1; i <= 100; i ++) {
		//	if(i%2==0) {
		//		sum+=i;
		//	}
		//}
		//cach2
		for(int i=2; i<=100; i+=2) {
			sum +=i;
		}
		System.out.println("tong so chan tu 1 den 100: " + sum);
	}
}
