package bai14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thong tin cong nhan khoan san pham: ");
		CNKSP a = new CNKSP();
		a.nhaptt();
		System.out.println("nhap thong tin cong nhan tinh cong nhat: ");
		CNTCN b = new CNTCN();
		b.nhaptt();
		a.intt();
		b.intt();
	}
}
