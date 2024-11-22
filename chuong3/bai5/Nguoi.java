package bai5;

public class Nguoi {
	private String ten;
	private int Tuoi;
	private char gioiTinh;

	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		super();
		this.ten = ten;
		Tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", Tuoi=" + Tuoi + ", gioiTinh=" + gioiTinh + "]";
	}

}
