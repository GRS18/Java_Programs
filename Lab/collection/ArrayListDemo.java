package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList arrlist = new ArrayList<>(); // 1st type

		ArrayList<Emp> arrlist = new ArrayList<Emp>(); // 2nd type (collection of Emp class Object)

//		List arrlist = new ArrayList();	//3rd type
//	Interface  obj           class

		// create obj of class
		Emp emp = new Emp(1, "Girish", 50000);
		Emp emp1 = new Emp(2, "Pratik", 40000);
		Emp emp2 = new Emp(3, "Ganesh", 30000);
		Emp emp3 = new Emp(4, "Kartik", 45000);

		// Add object in collection
		arrlist.add(emp);
		arrlist.add(emp1);
		arrlist.add(emp2);
		arrlist.add(emp3);

		// to display

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
			System.out.println("-----------------------------");
		}
	}
}
