package bai14;

import java.util.Scanner;

public class CNTCN extends CongNhan{
	private float luongCoBan;
	private float heSoLuong;
	private int soNgayCong;

	public CNTCN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CNTCN(String hoTen, String diaChi, String loaiCongNhan, float luongCoBan, float heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, loaiCongNhan);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	public float tinhluong() {
		float thuong = 0;
		if(soNgayCong < 20) {
			thuong = 0;
		}
		else {
			thuong = (float) (1.2 * luongCoBan);
		}
		return luongCoBan * heSoLuong + thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap luong co ban: ");
		this.luongCoBan = sc.nextFloat();
		System.out.println("he so luong: ");
		this.heSoLuong = sc.nextFloat();
		System.out.println("nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
	}
}
