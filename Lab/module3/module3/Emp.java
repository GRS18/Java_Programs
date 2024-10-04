package module3;

import java.util.Scanner;

public class Emp {

	Scanner in = new Scanner(System.in);

	private int empNo;
	private String empName;
	private double bal;

	public void accept() {
		System.out.println("Enter no.: ");
		empNo = in.nextInt();
		System.out.println("Enter Name: ");
		empName = in.next();
		System.out.println("Enter Balance: ");
		bal = in.nextDouble();
	}

	public void checkEmpNo() {
		if (empNo > 0)
			System.out.println("valid Employee no.");
		else
			System.out.println("Invalid Employee no.");
	}

	public void checkBal() {
		if (bal >= 0 && bal < 100000)
			System.out.println("valid Balance");
		else
			System.out.println("Produce the Proof");
	}

	public void display() {
		System.out.println("Emp Number " + empNo);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Balance " + bal);
	}

}
