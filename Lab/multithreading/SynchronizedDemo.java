package multithreading;

class Myclass implements Runnable {

	private static boolean flag = true;

	public synchronized void printEven() { // synchroized - threads runs in sequence manner
		long id = Thread.currentThread().getId();

		System.out.println("Even numbers ");
		for (int i = 2; i < 20; i += 2) {
			System.out.println(i + " Id is " + id);
		}
	}

	public synchronized void printOdd() {
		long id = Thread.currentThread().getId();

		System.out.println();
		System.out.println("Odd Numbers ");
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i + " Id is " + id);
		}
	}

	public void run() {

		if (flag == true) {
			flag = false;
			printEven();
		} else {
			printOdd();
		}
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		Myclass myclass = new Myclass();

		Thread event1 = new Thread(myclass); 
		Thread event2 = new Thread(myclass);

		event1.start();	//call run method
		event2.start();	//call run method

	}

}
