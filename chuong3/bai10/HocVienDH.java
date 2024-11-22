package bai10;

import java.util.Scanner;

public class HocVienDH extends HocVien {
	private int soBuoi;
	private double donGia;

	public HocVienDH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HocVienDH(String hoTen, String diaChi, String loatChuongTrinh, int loaiUuTien, int soBuoi, double donGia) {
		super(hoTen, diaChi, loatChuongTrinh, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGia = donGia;
	}
	public double hocphi() {
		int uutien=0;
		if(loaiUuTien == 1) {
			uutien = 1000000;
		}
		if(loaiUuTien == 2) {
			 uutien = 500000;
		}
		return soBuoi * donGia - uutien;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so buoi: ");
		this.soBuoi = sc.nextInt();
		System.out.println("nhap don gia: ");
		this.donGia = sc.nextDouble();
	}
}
