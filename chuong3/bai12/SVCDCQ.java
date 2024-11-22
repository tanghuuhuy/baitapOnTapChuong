package bai12;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
	private float tDKT;
	private float sMKT;
	private float dTKTHP;

	public SVCDCQ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSV, float tDKT, float sMKT, float dTKTHP) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
		this.dTKTHP = dTKTHP;
	}
	public float dtb() {
		return (tDKT/sMKT+dTKTHP)/3;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap diem trung binh cac mon kiem tra: ");
		this.tDKT = sc.nextFloat();
		System.out.println("nhap so mon kiem tra: ");
		this.sMKT = sc.nextFloat();
		System.out.println("nhap diem thi ket thuc hoc phan: ");
		this.dTKTHP = sc.nextFloat();
	}
}
