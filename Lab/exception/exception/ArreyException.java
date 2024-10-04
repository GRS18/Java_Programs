package exception;

public class ArreyException {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		try {

			System.out.println(arr[-22]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Given index is not correct");

			System.out.println("Length of Array is " + arr.length);

		}
	}

}
