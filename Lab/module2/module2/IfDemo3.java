package module2;

import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Number");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if ((num1 > num2) && (num1 > num3))
			System.out.println("Number " + num1 + " is Greater than " + num2 + " & " + num3);
		else if (num2 > num3)
			System.out.println("Number " + num2 + " is Greater than " + num1 + " & " + num3);
		else if((num1==num2) && (num1==num3) && (num2==num3))
			System.out.println("Number "+num1+","+num2+","+num3+" Is Equal Numbers");
		else
			System.out.println("Number " + num3 + " is Greater than " + num1 + " & " + num2);
			
	}

}
