package module2;

import java.util.Scanner;

public class IfDemo5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();
		if (num > 0) {
			int reminder = num % 10;
			int que = num / 10;
			System.out.println("Power is " + Math.pow(que, reminder));
		}

	}

}
