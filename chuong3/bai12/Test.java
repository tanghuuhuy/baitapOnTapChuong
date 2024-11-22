package bai12;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thong tin SVCDN: ");
		SVCDN a = new SVCDN();
		a.nhaptt();
		System.out.println("nhap thong tin SVCDCQ: ");
		SVCDCQ b = new SVCDCQ();
		b.nhaptt();
		a.intt();
		b.intt();
	}

}
