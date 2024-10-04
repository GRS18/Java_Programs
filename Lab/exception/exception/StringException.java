package exception;

public class StringException {

	public static void main(String[] args) {
		String str = "Girish in CDAC Nashik";
		try {

			System.out.println(str.substring(10));

			System.out.println(str.substring(22));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("Given index is wrong");

		}
	}

}
