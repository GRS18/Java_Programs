package module4;

public class UpwardCasting {

	public static void main(String[] args) {

		int a = 1001;
		double b = a;
		System.out.println("Upward Casting (Automatic): " + b);

		double c = 89.45;
		int d = (int) c;
		System.out.println("Downward Casting (Explicit): " + d);
	}
}
