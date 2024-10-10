package lambda;

interface Interface3 {
	void abcfun(int x, int y, int z);
}

public class MyClass3 {

	public static void main(String[] args) {

		Interface3 obj = (int x, int y, int z) -> {
			System.out.println("Multiplication: " + (x * y));
			System.out.println("Cube: " + (y * y * y));
			System.out.println("Addition: " + (x + y + z));
			System.out.println("Square: " + (z * z));
		};

		obj.abcfun(12, 5, 6);

	}

}
