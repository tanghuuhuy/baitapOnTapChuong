package bai14;

import java.util.Scanner;

public abstract class CongNhan {
	protected String hoTen;
	protected String diaChi;
	protected String loaiCongNhan;

	public CongNhan() {
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String hoTen, String diaChi, String loaiCongNhan) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
	}
	public abstract float tinhluong();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.hoTen = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap loai cong nhan: ");
		this.loaiCongNhan = sc.next();
	}
	public void intt() {
		System.out.println("ho ten: " + this.hoTen + "\ndia chi: " + this.diaChi + "\nloai cong nhan: " + this.loaiCongNhan + "luong thang : " + tinhluong());
	}

}
