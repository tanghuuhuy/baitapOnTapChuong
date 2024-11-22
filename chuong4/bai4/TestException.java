package bai4;

import java.util.Scanner;

import bai3.StringToolException;

public class TestException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		     System.out.println("Nhập chuỗi (hoặc nhập 'DONE' để kết thúc): ");
            String input = sc.nextLine();
            if (input.equals("DONE")) {
                 System.out.println("Kết thúc chương trình.");
                 break;
            }
            try {
        	     if(input.length() > 20) {
        		      throw new StringToolException("chuoi ky tu qua dai");
        	     }
        	     else{
        	    	 System.out.println("ky tu hop le " + input);
        	     }
            }
            catch(StringToolException e) {
            	System.out.println("loi " + e);
            }
        }
	}

}
