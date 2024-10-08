package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Character, String> hashmap = new HashMap<Character, String>();

		hashmap.put('G', "Girish");
		hashmap.put('k', "Kiran");
		hashmap.put('L', "Lina");
		hashmap.put('P', "Paresh");
		hashmap.put('R', "Radha");
		hashmap.put('V', "Varun");
		hashmap.put('S', null);
		hashmap.put(null, "Rohan");// only 1 null value is allowed in key

		System.out.println(hashmap);

		System.out.println("----------------key contain in hashmap-------------------");
		System.out.println(hashmap.containsKey('G'));

		hashmap.remove('p');

		System.out.println("----------------replace value from hashmap-----------------");
		hashmap.replace('S', null, "Sayali");

		System.out.println(hashmap);

		System.out.println("----------------Print key - values------------------");

		Object[] keys = hashmap.keySet().toArray();

		System.out.println("Keys & Values: ");

		for (int i = 0; i < keys.length; i++) {

			System.out.print(keys[i] + " : "); // to get keys

			System.out.println(hashmap.get(keys[i])); // to get name(value)

		}

		System.out.println("-------------------To get one value using key------------------");

		System.out.println(hashmap.get('V'));
	}
}
