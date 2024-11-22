package bai1;

import java.util.Scanner;

public class XuLySocChia {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập vào số thứ hai: ");
        int num2 = scanner.nextInt();
        try {
            // Kiểm tra nếu số chia bằng 0
            if (num2 == 0) {
                throw new ArithmeticException("Lỗi: Không thể chia cho 0.");
            }
            // Thực hiện phép chia và in kết quả
            int result = num1 / num2;
            System.out.println("Kết quả phép chia là: " + result);
        } 
        catch (ArithmeticException e) {
            // Xử lý ngoại lệ khi chia cho 0
            System.out.println(e.getMessage());
        } 
    }

}
