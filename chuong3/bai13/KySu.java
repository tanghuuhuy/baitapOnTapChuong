package bai13;

import java.util.Scanner;

public class KySu extends NguoiLaoDong{
	private float luongCoBan;
	private float heSoLuong;
	private int soNgayCong;

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public KySu(String hoTen, String diaChi, String loaiLD, float luongCoBan, float heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, loaiLD);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}


	public float tinhluong() {
		int thuong = 0;
		if(soNgayCong >=25) {
			thuong = 2000000;
		}
		else if(soNgayCong >= 15) {
			thuong = 1000000;
		}
		else {
			thuong = 500000;
		}
		return luongCoBan * heSoLuong + thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap luong co ban: ");
		this.luongCoBan = sc.nextFloat();
		System.out.println("nhap he so luong: ");
		this.heSoLuong = sc.nextFloat();
		System.out.println("nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
	}
}
