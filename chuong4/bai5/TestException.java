package bai5;

import java.util.Scanner;

public class TestException {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap luong : ");
		 int luong = sc.nextInt();
		 try {
			 if(luong < 5000000 || luong >20000000) {
				 throw new OutOfRangeException ("khong nam trong 5.000.000 - 20.000.000");
			 }
			 else {
				 System.out.println("nam trong 5.000.000 - 20.000.000" + luong);
			 }
		 }
		 catch(OutOfRangeException e){
			 System.out.println("loi " + e);
		 }
	 }

}
