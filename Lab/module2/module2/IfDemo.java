package module2;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();
		if (num > 0)
			System.out.println("IS Positive Number");
		else if (num == 0)
			System.out.println("Number is 0");
		else
			System.out.println("Is Negative Number");

	}

}
