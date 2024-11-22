package bai10;

import java.util.Scanner;

public abstract class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected String loatChuongTrinh;
	protected int loaiUuTien;

	public HocVien() {
		// TODO Auto-generated constructor stub
	}

	public HocVien(String hoTen, String diaChi, String loatChuongTrinh, int loaiUuTien) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loatChuongTrinh = loatChuongTrinh;
		this.loaiUuTien = loaiUuTien;
	}

	public abstract double hocphi();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		this.hoTen = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap loai chuong trinh: (do hoa || lap trinh)");
		this.loatChuongTrinh = sc.next();
		System.out.println("nhap loai uu tien: (1 hoac 2");
		int loaiUuTien = sc.nextInt();
	}
	public void intt() {
		System.out.println("ho ten: " + this.hoTen);
		System.out.println("dia chi: " + this.diaChi);
		System.out.println("loai chuong trinh: " + this.loatChuongTrinh);
		System.out.println("loai uu tien " + this.loaiUuTien);
		System.out.println("hoc phi: " + hocphi());
	}
}
