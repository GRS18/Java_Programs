package stringpackage;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("  Girish Shinde");
		String str2 = new String("  Shinde");
		System.out.println(str);
		System.out.println(str2);
		System.out.println("------------Substring()----------------");
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));
		System.out.println("--------------trim()-------------");

		System.out.println(str.trim());
		System.out.println(str2.trim());

		System.out.println("-------------uppercase,lowercase---------------");
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());

		System.out.println("--------------nested function trim,tolowercase-----------------");
		System.out.println(str.trim().toLowerCase()); // nested Function

		System.out.println("---------------replace------------------");
		System.out.println(str.replace("i", "e"));

		System.out.println("-----------------indexof-------------------");
		System.out.println(str2.indexOf("d"));

		System.out.println("--------------equals/equalsIgnorecase--------------------");
		if (str.equalsIgnoreCase(str2))
			System.out.println("Same");
		else
			System.out.println("not same");

		System.out.println("-------------------split----------------------");
		String[] arr = str.split(" ");
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
