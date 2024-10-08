package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<Integer, String>();

		// Duplicate key is not allow , key and value can not be null
		table.put(1, "Girish");
		table.put(2, "Ram"); // not print due to duplication
		table.put(2, "Radha");
		table.put(3, "Laxman");
		table.put(4, "Bharat");
		table.put(5, "shanta");
		table.put(6, "Arjun");
		table.put(7, "Nakul");
		table.put(8, "Shyam");
		table.put(9, "Vrunda");

		System.out.println(table);

		System.out.println("----------------Print value using key-----------------");
		System.out.println(table.get(1));
		System.out.println(table.get(6));
	}

}
