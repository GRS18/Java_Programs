package module2;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 Number");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1>num2)
			System.out.println("Number "+num1+" is Greater");
		else if(num1==num2)
			System.out.println("Number "+num1+" & "+num2+" is Same");
		else
			System.out.println("Number "+num2+" is Greater");
	}

}
