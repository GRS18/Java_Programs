package module4;

public class OverLoading {

	static public int add(int a, int b) { // use static keyword so don't need to create an object to call function
		return (a + b);
	}

	static public int add(int a, int b, int c) {
		return (a + b + c);
	}

	static public double add(int a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		int result = add(10, 40); // directly call function without using object because use static keyword
		System.out.println(result);
		int result1 = add(10, 40, 50);
		System.out.println();
		System.out.println(result1);
		double result2 = add(10, 20.50);
		System.out.println(result2);
	}

}
