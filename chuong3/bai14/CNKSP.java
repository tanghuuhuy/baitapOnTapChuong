package bai14;

import java.util.Scanner;

public class CNKSP extends CongNhan{
	private int soSanPham;
	private float donGiaSanPham;

	public CNKSP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CNKSP(String hoTen, String diaChi, String loaiCongNhan, int soSanPham, float donGiaSanPham) {
		super(hoTen, diaChi, loaiCongNhan);
		this.soSanPham = soSanPham;
		this.donGiaSanPham = donGiaSanPham;
	}
	public float tinhluong() {
		int thuong = 0;
		if(soSanPham <= 1000) {
			thuong = 0;
		}
		else if(soSanPham >=1100 && soSanPham < 1150000) {
			thuong = 1000000;
		}
		else {
			thuong = 1500000;
		}
		return soSanPham * donGiaSanPham + thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so san pham: ");
		this.soSanPham = sc.nextInt();
		System.out.println("nhap don gia san pham: ");
		this.donGiaSanPham = sc.nextFloat();
	}

}
