package bai2;

import java.util.Scanner;

public class TestExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exchange ex = new Exchange();
		System.out.println("nhao ma tien te thu nhat: ");
		String code1 = sc.next();
		System.out.print("Nhập mã tiền tệ thứ hai: ");
        String code2 = sc.next();
        System.out.println("nhap so tien can chuyen doi: ");
        double amount = sc.nextDouble();
        double money = ex.convert(code1, code2, amount);
        if(money != -1) {
        	System.out.println("luong tien sau chuyen doi: " + money);
        }
	}

}
