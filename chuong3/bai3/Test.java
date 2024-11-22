package bai3;

public class Test {

	public static void main(String[] agrs) {
		//khoi tao gia tri
		DiaChi dc = new DiaChi("chau phong", "lien ha", "dong anh", "ha noi");
		System.out.println(dc);
		//kiem tra pt tao va tostring
		NhanVien nv = new NhanVien("kim jenne", dc, "10/2/2001", 'N');
		System.out.println(nv);
		//kiem tra pt getter va setter
		nv.setName("nguyen van a");
		nv.getName();
		nv.setAddress(dc);
		nv.getAddress();
		nv.setDob("10/2/2001");
		nv.getDob();
		nv.setGender('m');
		nv.getGender();
		System.out.println(nv);
	}

}
