package bai6;

import java.util.Scanner;

public class Employee extends Person{
	private  String employeeID;
	private String dateHired;
	private double hsLuong;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, char gender, String employeeID, String dateHired, double hsLuong) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.dateHired = dateHired;
		this.hsLuong = hsLuong;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public double getHsLuong() {
		return hsLuong;
	}

	public void setHsLuong(double hsLuong) {
		this.hsLuong = hsLuong;
	}

	@Override
	public String toString() {
		return super.toString() +  "Employee [employeeID=" + employeeID + ", dateHired=" + dateHired + ", hsLuong=" + hsLuong + "]";
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("nhap ma nv: ");
		this.employeeID = sc.next();
		System.out.println("nhap ngay lam: ");
		this.dateHired = sc.next();
		System.out.println("nhap hs luong: ");
		this.hsLuong = sc.nextDouble();
	}
}
