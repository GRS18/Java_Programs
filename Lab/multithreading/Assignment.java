/*1. create a function to display the sum of first 10 prime numbers, 
create another function to display the natural numbers between 20 to 30
create 2 threads to call the functions. use synchronized*/
package multithreading;

class Numbers implements Runnable {

	private static boolean flag = true;

	public synchronized void printNo() {
		long id = Thread.currentThread().getId();

		int sum = 0;
		System.out.println("Sum of first 10 numbers ");
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public synchronized void naturalNo() {
		long id = Thread.currentThread().getId();

		System.out.println();
		System.out.println("Natural Numbers ");
		for (int i = 20; i <= 30; i++) {
			System.out.println(i);
		}
	}

	public void run() {

		if (flag == true) {
			flag = false;
			printNo();
		} else {
			naturalNo();
		}
	}
}

public class Assignment {

	public static void main(String[] args) {

		Numbers numbers = new Numbers();

		Thread event1 = new Thread(numbers);
		Thread event2 = new Thread(numbers);

		event1.start();
		event2.start();

	}

}
