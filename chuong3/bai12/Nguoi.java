package bai12;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSV;

	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSV = loaiSV;
	}
	public abstract float dtb();
	public void nhaptt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho ten: " );
		this.hoTen = sc.next();
		System.out.println("nhap ngay sinh: " );
		this.ngaySinh = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap loai sv (svcdn || svcdcq");
		this.loaiSV = sc.next();
	}
	public void intt() {
		System.out.println("hoten: " + this.hoTen + "\nngay sinh: " + this.ngaySinh + "\ndia chi: " + this.diaChi + "loai sv: " + this.loaiSV + "\ndtb" + dtb());

	}

}
