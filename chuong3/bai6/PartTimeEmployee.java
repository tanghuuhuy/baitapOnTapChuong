package bai6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	private int hoursPerWeek;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gender, String employeeID, String dateHired, double hsLuong, int hoursPerWeek) {
		super(name, age, gender, employeeID, dateHired, hsLuong);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return super.toString() +  "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap h lam: ");
		this.hoursPerWeek = sc.nextInt();
	}

}
