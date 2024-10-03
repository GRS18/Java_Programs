package module5;

import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[3][4];

		System.out.println("Enter 12 Elements in Multi Dimensional Array ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println("===============Multi Dimensional Array===============");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t\t ");
			}
			System.out.println();
		}

	}

}
