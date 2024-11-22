package bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien{
	private float luongCoBan;
	private float heSoLuong;
	private int namCongTac;

	public GVCoHuu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GVCoHuu(String hoTen, String diaChi, String loaiGV, float luongCoBan, float heSoLuong, int namCongTac) {
		super(hoTen, diaChi, loaiGV);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.namCongTac = namCongTac;
	}
	public double tinhLuong(){
		double phucap = 0;
		if(namCongTac <=5) {
			phucap =(double) (0*luongCoBan);
		}
		else if(namCongTac == 5) {
			phucap = 0.05*luongCoBan;
		}
		else {
			phucap = (namCongTac/100)*luongCoBan;
		}
		return luongCoBan*heSoLuong+phucap;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap luong co ban: " + this.luongCoBan);
		this.luongCoBan = sc.nextFloat();
		System.out.println("nhap he so luong: " + this.heSoLuong);
		this.heSoLuong = sc.nextFloat();
		System.out.println("nhap nam cong tac: " + this.namCongTac);
		this.namCongTac = sc.nextInt();
	}

}
