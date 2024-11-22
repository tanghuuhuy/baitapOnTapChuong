package bai3;

public class bai3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		//a
		float x1 = a|b;
		//b
		float x2 = a&b;
		//c
		float x3 = a^b;
		//d
		float x4 = ~a;
		//e
		float x5 = a>>2;
		//f
		float x6 = b<<2;
		System.out.println(" a|b = " + x1 + "\n a&b = " + x2 + "\n a^b = " + x3 + "\n ~a = " + x4 + "\n a>>2 = " + x5 + "\n b<<2 = "+ x6);
	}

}
