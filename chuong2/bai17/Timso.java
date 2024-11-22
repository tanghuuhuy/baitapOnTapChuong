package bai17;

public class Timso {

	public static void main(String[] args) {
        System.out.println("Các số ba chữ số thỏa mãn điều kiện a^3 + b^3 + c^3 là:");
        for(int i = 100; i<=999; i++) {
        	//tach so
        	int a = i / 100;       
            int b = (i / 10) % 10; 
            int c = i % 10; 
        	if((a*a*a + b*b*b + c*c*c) == i) {
        		System.out.println(i);
        	}
        }
    }
}
