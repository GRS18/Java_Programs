package lambda;

import java.util.Scanner;

interface Interface4 {
	void absFun(int x);

}
public class MyClass4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Interface4 obj = (int x) -> {
			if (x % 2 == 0)
				System.out.println("Nmuber is Even");
			else
				System.out.println("Number is Odd");
		};

		System.out.println("Enter number ");
		int n = in.nextInt();
		obj.absFun(n);
	}

}
