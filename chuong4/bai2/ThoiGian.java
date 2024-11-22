package bai2;

public class ThoiGian {
	private int ngay;
	private int thang;
	private int nam;

	public ThoiGian() {
		// TODO Auto-generated constructor stub
	}

	public ThoiGian(int ngay, int thang, int nam)  throws InvalidDateException{
		if(nam<0) {
			throw new InvalidDateException("nam k hop le");
		}
		if(thang < 1 || thang > 12) {
			throw new InvalidDateException("thang k hop le");
		}
		if(ngay < 0 || ngay > 31) {
			throw new InvalidDateException("ngay k hop le");
		}
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "ThoiGian [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}
}
