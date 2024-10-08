package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyListDemo2 {

	public static void main(String[] args) {

		ArrayList arrlist = new ArrayList();

		arrlist.add(10);
		arrlist.add(33.99);
		arrlist.add("Girish");
		arrlist.add("Ram");
		arrlist.add(true);

		Emp emp = new Emp(1, "Girish", 50000);
		Emp emp1 = new Emp(2, "Pratik", 40000);

		arrlist.add(emp);
		arrlist.add(emp1);

		arrlist.contains(emp);

//		for (int i = 0; i < arrlist.size(); i++) {
//			System.out.println(arrlist.get(i));
//			System.out.println("-----------------------------");
//		}

//		2nd method to Display
		System.out.println("Using Iterator Method ");
		Iterator itr = arrlist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// to check whether obj is present :result t/f
		boolean res = arrlist.contains("Girish");
		System.out.println(res);

		// returns the integer if present else -1
		int res1 = arrlist.indexOf("Ram");
		System.out.println("Indexof : " + res1);

		int res2 = arrlist.indexOf("Pritam");
		System.out.println("Indexof : " + res2);

		System.out.println("Using the remove");
		// to remove the obj

		arrlist.remove("Ram");
		arrlist.remove(2);

		// to delete all the Element
		arrlist.clear();
		System.out.println(arrlist.isEmpty()); // t/f

		arrlist.add("byy"); // add element last
		arrlist.add(0, 688); // add element 1st

		// to change the obj
		arrlist.set(1, 89);

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
			System.out.println("-----------------------------");
		}
	}

}
