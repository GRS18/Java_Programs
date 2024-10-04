package exception;

import java.util.Scanner;

public class SingleException {

	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		try {
			double result = divide(num1, num2);

			System.out.println("Result: " + result);
		} catch (ArithmeticException e) { // class name obj
			System.out.println("We can not divide any number by 0");

//			// 1st method
//			System.out.println("1st method");
//			System.out.println(e.getMessage());

			// 2nd method
			System.out.println("2nd method");
			e.printStackTrace();

//			// 3rd method
//			System.out.println("3rd method");
//			System.out.println(e);
		}

	}

}
