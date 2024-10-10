package lambda;

import java.util.ArrayList;

public class MyClassArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(12);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(22);
		arrlist.add(56);
		arrlist.add(32);
		arrlist.add(10);

		// Display--> 1st use of Lambda Function
		System.out.println("Members in ArrayList: ");
		arrlist.forEach(n -> System.out.println(n));

		// 2nd use of lambda Expression
		// display the even numbers
		System.out.println("Displaying Even and odd numbers: ");

		arrlist.forEach(n -> {

			if (n % 2 == 0) {
				System.out.println(" " + n);
			} else {
			}
		});

	}

}
