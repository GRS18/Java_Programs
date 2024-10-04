package exception;

import java.util.Scanner;

public class GeneralizeException {

	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		String str1 = in.next();
		String str2 = in.next();

		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			double result = divide(num1, num2);

			System.out.println("Result: " + result);
		} catch (Exception e1) { // generalized Exception
									// (if there is no Exception handled then it handle)
			System.out.println("Error: there is an Error.........");
		} finally {
			System.out.println("Finally always Executed ");
		}

	}

}
