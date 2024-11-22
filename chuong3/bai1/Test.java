package bai1;

public class Test {

	public static void main(String[] agrs) {
		Person ps = new Person();
		ps.setName("Nguyen Van A");
		ps.getName();
		ps.setDob("2/9/1945");
		ps.getDob();
		ps.setPob("ha noi");
		ps.getPob();
		ps.setGender('M');
		ps.getGender();
		ps.setEmail("sbc@gmail.com");
		ps.getEmail();
		ps.setPhone("012345678");
		ps.getPhone();
		System.out.println(ps);
	}

}
