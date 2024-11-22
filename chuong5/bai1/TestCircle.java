package bai1;

import java.util.Random;
import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleCollection a = new CircleCollection();
        Random random = new Random();
        System.out.print("Nhập số lượng hình tròn: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double radius = 100 * random.nextDouble(); // r random
            Circle circle = new Circle(radius);
            a.addCircle(circle);
        }
        // danh sach hinh tron
        System.out.println("\nThông tin các hình tròn trong danh sách:");
        System.out.println(a);
        // tong dien tich
        System.out.println("Tổng diện tích của các hình tròn: " + a.calcSumArea());
        // dien tich lon nhat
        double maxArea = a.findMaxArea();
        System.out.println("Diện tích lớn nhất: " + maxArea);
        // dien tich nho nhat
        double minArea = a.findMinArea();
        System.out.println("Diện tích nhỏ nhất: " + minArea);
        // hien thi thong tin cua hinh tron co dien tich nho nhat
        for (int i = 0; i < n; i++) {
            Circle circle = a.getCircle(i);
            if (circle != null && circle.getArea() == minArea) {
                System.out.println("Hình tròn có diện tích nhỏ nhất: \n" + circle);
                break;
            }
        }
	}
}
