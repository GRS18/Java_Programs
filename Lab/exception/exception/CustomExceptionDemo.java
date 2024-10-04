package exception;

import java.util.Scanner;

class CheckPassword extends Exception {
	public CheckPassword(String msg) {

		super(msg);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter password: ");
		String password = in.next();

		try {
			if (password.length() < 8) {

				throw new CheckPassword("Password length should be more than 8 character");
				// anonymous object
				// to  check for pattern matching

			} else if (password.matches("[A-Za-z0-9]")) {// Girish123@@@ - false

				throw new CheckPassword("Password should have special charecter");

			} else {

				System.out.println("vaild password......");
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			// "[0-9]{6}": 6 numbers are allowed [a-z]{5}: 5 ch allowed
		}
	}

}
