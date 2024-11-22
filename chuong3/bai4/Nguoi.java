package bai4;

import java.util.Scanner;

public class Nguoi {
	private String ten;
	private int tuoi;
	private String gioiTinh;

	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

	
	public Nguoi(String ten, int tuoi, String gioiTinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.ten = sc.next();
		System.out.println("nhap tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.println("nhap gioi tinh: ");
		this.gioiTinh = sc.next();	
	}

}
