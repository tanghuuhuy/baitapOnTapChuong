package bai13;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong{
	private int soNgayCong;
	private float donGiaNgayCong;

	public LaoDongPhoThong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LaoDongPhoThong(String hoTen, String diaChi, String loaiLD, int soNgayCong, float donGiaNgayCong) {
		super(hoTen, diaChi, loaiLD);
		this.soNgayCong = soNgayCong;
		this.donGiaNgayCong = donGiaNgayCong;
	}
	public float tinhluong() {
		int thuong = 0;
		if(soNgayCong >=25) {
			thuong = 1000000;
		}
		else if(soNgayCong >= 15) {
			thuong = 700000;
		}
		else {
			thuong = 0;
		}
		return soNgayCong * donGiaNgayCong + thuong;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
		System.out.println("nhap don gia ngay cong: ");
		this.donGiaNgayCong = sc.nextFloat();
	}


}
