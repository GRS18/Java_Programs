/* create an ArrayList to store the 2 objects of Account object and 2 objs of Emp class and 3 names .
display all the objects , remove the 3rd object, use contains() to check the object is present,
display all the objects using iterator, */
package collection;

import java.util.ArrayList;

public class Assignment {

	public static void main(String[] args) {

		ArrayList arrlist = new ArrayList();

		Account acc = new Account(1, "Girish", 50000);
		Account acc1 = new Account(2, "Jatin", 40000);

		arrlist.add(acc);
		arrlist.add(acc1);

		Emp emp = new Emp(1, "Girish", 50000);
		Emp emp1 = new Emp(2, "Pratik", 40000);

		arrlist.add(emp);
		arrlist.add(emp1);

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
			System.out.println("-----------------------------");
		}
		System.out.println("-----remove object and check is present or not(t/f)-----");
		arrlist.remove(emp);

		System.out.println(arrlist.contains(emp));

		System.out.println("-----remove all objects and check arraylist is empty(t/f)-----");
		arrlist.clear();

		System.out.println(arrlist.isEmpty());
	}

}
