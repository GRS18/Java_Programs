package inheritance;

import java.util.Scanner;

public class EmailValidation {

	public void checkEmail(String email) {
		int a = email.indexOf("@");
		System.out.println("Position of @ in mail: " + a);

		int d = email.indexOf(".");
		System.out.println("Position of , in mail: " + d);

		if (a > -1 && d > -1 && a < d) // -1 is last position in String
		{
			System.out.println("Vaild Email ID....");
		} else {
			System.out.println("Invaild Email......");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		EmailValidation emailValidation = new EmailValidation();

		System.out.println("Enter Email ID: ");
		String email = in.next();

		emailValidation.checkEmail(email);

	}

}
