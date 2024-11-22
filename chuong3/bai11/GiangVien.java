package bai11;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;

	public GiangVien() {  
		// TODO Auto-generated constructor stub
	}

	public GiangVien(String hoTen, String diaChi, String loaiGV) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}
	public abstract double tinhLuong();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		this.hoTen = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap loai gv(GV co huu || GV thinh giang: ");
		this.loaiGV = sc.next();
	}
	public void intt() {
		System.out.println("hoten: "+this.hoTen + "\ndiachi: "+this.diaChi + "\nloai giang vien: " + this.loaiGV + "\nluong thang: " + tinhLuong());
	}

	
}
