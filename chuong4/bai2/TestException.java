package bai2;

public class TestException {

	 public static void main(String[] args) {
	        try {
	            ThoiGian tg1 = new ThoiGian(29, 2, 2024); 
	            System.out.println("Thời gian hợp lệ: " + tg1);
	        } 
	        catch (InvalidDateException e) {
	            System.out.println(e);
	        }

	        try {
	            ThoiGian tg2 = new ThoiGian(32, 5, 2024); 
	            System.out.println("Thời gian hợp lệ: " + tg2);
	        } 
	        catch (InvalidDateException e) {
	            System.out.println(e);
	        }
	 }

}
