package module2;

public class Odd {

	public static void main(String[] args) {
		System.out.println("10 odd numbers");

		int n = 1;
		while (n <= 20) {
			if (n % 2 != 0)
				System.out.println(n);
			n++;
		}

	}

}
