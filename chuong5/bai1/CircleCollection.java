package bai1;

import java.util.ArrayList;

public class CircleCollection {

	private ArrayList<Circle> al = new ArrayList<>(); 

    // Thêm một hình tròn vào danh sách
    public void addCircle(Circle c) {
        al.add(c);
    }

    // Lấy hình tròn tại vị trí pos trong danh sách
    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < al.size()) {
            return al.get(pos);
        }
        return null;  // Nếu vị trí không hợp lệ
    }

    // Thiết lập hình tròn tại vị trí pos trong danh sách
    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < al.size()) {
            al.set(pos, c);
        }
    }

    // Phương thức trả về thông tin tất cả các hình tròn trong danh sách
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Circle c : al) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    // Tính tổng diện tích của tất cả các hình tròn trong danh sách
    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    // Tìm diện tích nhỏ nhất trong danh sách
    public double findMinArea() {
        if (al.isEmpty()) return 0;
        double minArea = al.get(0).getArea();
        for (Circle c : al) {
            minArea = Math.min(minArea, c.getArea());
        }
        return minArea;
    }

    // Tìm diện tích lớn nhất trong danh sách
    public double findMaxArea() {
        if (al.isEmpty()) return 0;
        double maxArea = al.get(0).getArea();
        for (Circle c : al) {
            maxArea = Math.max(maxArea, c.getArea());
        }
        return maxArea;
    }

}
