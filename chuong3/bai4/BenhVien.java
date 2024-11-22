package bai4;

import java.util.Scanner;

public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;

	public BenhVien() {
		// TODO Auto-generated constructor stub
	}
	//constructors
	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	//tao getter va setter
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	//toString
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten benh vien: ");
		this.ten = sc.next();
		System.out.println("nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.println("nhap ten giam doc");
		this.giamDoc = sc.next();
		
	}

}
