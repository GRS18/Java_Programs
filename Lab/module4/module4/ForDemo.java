package module4;

public class ForDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Before if..... " + i);
			if (i == 5)
				break; // use break keyword
			// System.out.println("After if........"+i);
		}

		System.out.println("===========================================");

		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue; // use continue keyword
			System.out.println("After if........" + i);
		}
	}

}
