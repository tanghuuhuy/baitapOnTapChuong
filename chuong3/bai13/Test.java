package bai13;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thong tin lap dong pho thong: ");
		LaoDongPhoThong a = new LaoDongPhoThong();
		a.nhaptt();
		System.out.println("nhap thong tin ky su: ");
		KySu b = new KySu();
		b.nhaptt();
		a.intt();
		b.intt();
	}

}
