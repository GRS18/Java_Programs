package module2;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();

		switch (num) {

		case 5:
			System.out.println("it's Movie Time");
			break;
		case 4:
			System.out.println("Enjoy Sunday");
			break;
		case 3:
			System.out.println("Going to Trip");
			break;
		default:
			System.out.println("It's Work Time");

		}

	}

}
