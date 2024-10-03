package stringpackage;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Girish");

		System.out.println("-------------append----------------");
		sb.append(" IN CDAC Nashik");
		System.out.println(sb);

		System.out.println("-----------indexof-------------");
		System.out.println(sb.indexOf("I"));

		System.out.println("------------lastindexof----------------");
		int la = sb.lastIndexOf("d");
		System.out.println(la);

		System.out.println("---------------delete---------------");
		sb.delete(6, 8);
		System.out.println(sb);

		System.out.println("--------------reverse---------------");
		System.out.println(sb.reverse());
	}

}
