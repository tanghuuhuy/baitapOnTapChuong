package bai15;

import java.util.Scanner;

public class Giaphong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia 1 phong cua nha nghi: ");
		float gia = sc.nextFloat();
		System.out.println("nhap so ngay luu tru: ");
		int ngay = sc.nextInt();
		float tien=0;
		if(ngay == 1) {
			tien = gia;
		}
		else if(ngay <= 4 ) {
			tien = (float) (gia + (gia*0.2 + gia)*(float)(ngay-1));
		}
		else if(ngay <= 10 ) {
			tien = (float) (gia + (gia*0.2 + gia)*3 + (gia*0.4)*(float)(ngay-4));
		}
		else {
			tien = (float) (gia + (gia*0.2 + gia)*3 + gia*0.6*6 + (float)(ngay-10)*gia*0.4);
		}
		System.out.println("tien phong phai tra: " + tien);
	}
}
