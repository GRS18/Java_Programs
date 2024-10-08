package multithreading;

class Demo {

	public void fun1() {
		System.out.println("this is fun1");
	}

	public void fun2() {
		System.out.println("this is fun2");
	}
}
class Multithread extends Thread {

	Demo demo = new Demo();

	public void run() {
		demo.fun1();
		demo.fun2();
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("ID is: " + id);
		System.out.println("-----------------------------");
		System.out.println("Name is: " + name);
		System.out.println("Girish Shinde.");
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {

//		Multithread thread1 = new Multithread();
//		thread1.start(); // will call run()
//
//		Multithread thread2 = new Multithread();
//		thread2.start();
//
//		Multithread thread3 = new Multithread();
//		thread3.start();

		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			Multithread thread = new Multithread();
			thread.start();

		}
	}

}
