package bai5;

public class Test {

	public static void main(String[] args){
		Truong tr = new Truong("lien ha", "lien ha", "sbc");
		SinhVien sv = new SinhVien();
		sv.setTen("nguyen van a");
		sv.setTuoi(18);
		sv.setGioiTinh('n');
		sv.setLop("12a2");
		sv.setNganh("khoi a");
		sv.getTen(); sv.getTuoi(); sv.getGioiTinh(); sv.getLop(); sv.getNganh();
		sv.setTruong(tr);
		sv.getTruong();
		System.out.println(sv);
	}

}
