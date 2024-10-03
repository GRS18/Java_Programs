package module5;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Enter Array Members");
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println("===================1st method to print array==================");
		// 1st method to print array
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("===================2nd method to print array==================");
		// 2nd method to print array : Enhanced For Loop
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
