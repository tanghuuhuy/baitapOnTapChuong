package bai12;

import java.util.Scanner;

public class SVCDN extends Nguoi{
	private float tDKT;
	private float sMKT;

	public SVCDN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSV, float tDKT, float sMKT) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
	}
	public float dtb() {
		return tDKT/sMKT;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap diem trung binh cac mon kiem tra: ");
		this.tDKT = sc.nextFloat();
		System.out.println("nhap so mon kiem tra: ");
		this.sMKT = sc.nextFloat();
	}

}
