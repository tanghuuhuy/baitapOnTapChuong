package bai13;

import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLD;

	public NguoiLaoDong() {
		// TODO Auto-generated constructor stub
	}

	public NguoiLaoDong(String hoTen, String diaChi, String loaiLD) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLD = loaiLD;
	}
	public abstract float tinhluong();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.hoTen = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap loai lao dong: ");
		this.loaiLD = sc.next();
	}
	public void intt() {
		System.out.println("ho ten: " + this.hoTen + "\ndia chi: " + this.diaChi + "\nloai ld: " + this.loaiLD + "luong thang : " + tinhluong());
	}

}
