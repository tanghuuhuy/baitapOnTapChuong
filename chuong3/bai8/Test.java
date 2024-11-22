package bai8;

public class Test {

	public static void main(String[] args) {
		Reactangle hcn = new Reactangle();
		hcn.input();
		Triangle tg = new Triangle();
		tg.input();
		System.out.println("dien tich hinh chu nha: " + hcn.getArea() + "\ndien tich hinh tam giac: " + tg.getArea());
	}

}
