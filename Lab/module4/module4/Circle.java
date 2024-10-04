package module4;

import java.util.Scanner;

public class Circle {
	private double radius;
	private double area1;
	private double peri;

	final double PI = 3.142;
	Scanner in = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter radius: ");
		radius = in.nextDouble();
	}

	public void calArea() {
		area1 = PI * radius * radius;
	}

	public void calPeri() {
		peri = 2 * PI * radius;
	}

	public void display() {
		System.out.println("Radius " + radius);
		System.out.println("Area " + area1);
		System.out.println("Perimeter " + peri);
	}

}