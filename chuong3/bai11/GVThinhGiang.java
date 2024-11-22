package bai11;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
	private int soTietDay;
	private float dongia;

	public GVThinhGiang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GVThinhGiang(String hoTen, String diaChi, String loaiGV, int soTietDay, float dongia) {
		super(hoTen, diaChi, loaiGV);
		this.soTietDay = soTietDay;
		this.dongia = dongia;
	}
	public double tinhLuong() {
		double thunhap = 0;
		thunhap = 0.15*(soTietDay*dongia);
		return soTietDay*dongia-thunhap;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tiet day: " + this.soTietDay);
		this.soTietDay = sc.nextInt();
		System.out.println("nhap don gia: " + this.dongia);
		this.dongia = sc.nextFloat();
	}

}
