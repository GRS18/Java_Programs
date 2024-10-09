/* Create a Account class with the following mv
private int accNo
private String name 
private double balance
create an ArrayList to store the 6 objects of Account objects, 
display all objects*/
package collection;

// <----Assignment 1
import java.util.ArrayList;

public class TestAccount {

	public static void main(String[] args) {

		ArrayList<Account> arrlist = new ArrayList<>();

		Account acc = new Account(1, "Girish", 50000);
		Account acc1 = new Account(2, "Jatin", 40000);
		Account acc2 = new Account(3, "Raj", 30000);
		Account acc3 = new Account(4, "Kartik", 45000);
		Account acc4 = new Account(3, "Radha", 30000);
		Account acc5 = new Account(4, "Pallavi", 45000);

		arrlist.add(acc);
		arrlist.add(acc1);
		arrlist.add(acc2);
		arrlist.add(acc3);
		arrlist.add(acc4);
		arrlist.add(acc5);

		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
			System.out.println("-----------------------------");
		}

		

	}

}
