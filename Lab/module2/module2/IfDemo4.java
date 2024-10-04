package module2;

import java.util.Scanner;

public class IfDemo4 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Number");
			int num = in.nextInt();
			if ((num > 0 ) && (num <10))
				System.out.println(num + " is 1 digit number " );
			else if (num>10 && num <100)
				System.out.println(num + " is 2 digit number " );
			else if (num>99 && num <1000)
				System.out.println(num + " is 3 digit number " );
			else if (num>999 && num <10000)
				System.out.println(num + " is 4 digit number " );
			else
				System.out.println(num+" is Greater than 4 digit number");

	}

}
