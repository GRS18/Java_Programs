package module3;

import java.util.Scanner;

public class User {
	Scanner in = new Scanner(System.in);

	private String name;
	private int age;
	private double salary;

	public void accept() {
		System.out.println("Enter Name: ");
		name = in.next();
		System.out.println("Enter age: ");
		age = in.nextInt();
		System.out.println("Enter salary: ");
		salary = in.nextDouble();
	}

	public void checkAge() {
		if (age > 18 && age < 100)
			System.out.println("valid Age");
		else
			System.out.println("Invalid Age");

	}

	public void checkSalary() {
		if (salary > 30000 && salary < 100000)
			System.out.println("vaild Salary");
		else
			System.out.println("Invalid Salary");
	}

	public void display() {
		System.out.println("Enter Name " + name);
		System.out.println("Enter age " + age);
		System.out.println("Enter salary " + salary);
	}
}
