package bai4;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
	private String tienSu;
	private String chanDoan;
	private BenhVien benhVien;

	public BenhNhan() {
		// TODO Auto-generated constructor stub
	}

	public BenhNhan(String ten, int tuoi, String gioiTinh) {
		super(ten, tuoi, gioiTinh);
		// TODO Auto-generated constructor stub
	}

	public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
		super();
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	@Override
	public String toString() {
		return super.toString() +  "BenhNhan [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tien su: ");
		this.tienSu = sc.next();
		System.out.println("nhap chuan doan: ");
		this.chanDoan = sc.next();
	}
}
