package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// collection of integer array
		// TreeSet<Integer> tree1 = new TreeSet<Integer>();
		TreeSet<Integer> tree1 = new TreeSet<>();

		tree1.add(20);
		tree1.add(10);
		tree1.add(50);
		tree1.add(33);

		System.out.println("Size is " + tree1.size());

		Iterator itr = tree1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------------print using simple SOP---------------");
		System.out.println(tree1);

		System.out.println("--------------print using Enhanced for loop---------------");
		for (int i : tree1) {
			System.out.println(i);
		}

		System.out.println("---------------remove element-----------------");
		// to remove the object
		tree1.remove(10);
		System.out.println("Fist element removed");

		System.out.println("----------------get 1st and last element-------------------");
		System.out.println("First" + tree1.first());
		System.out.println("Last" + tree1.last());

		System.out.println("----------------is element contain (t/f)----------------");
		System.out.println(tree1.contains(33));

		System.out.println("----------------clear elements----------------");
		tree1.clear();
		System.out.println("all elements clear");

		System.out.println("----------------is empty(t/f)--------------------");
		System.out.println(tree1.isEmpty());

	}

}
