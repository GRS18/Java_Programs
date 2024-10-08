package multithreading;

class Multithread2 implements Runnable {

	public void fun1() {
		System.out.println("This is Fun1");
	}

	public void fun2() {
		System.out.println("This is Fun2");
	}

	public void run() {
		fun1();
		fun2();
		System.out.println("Id is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
	}
}

public class MultithreadDemo2 {

	public static void main(String[] args) {

		Multithread2 obj1 = new Multithread2();
		Thread thread1 = new Thread(obj1);
		thread1.setPriority(7);
		thread1.start();
		System.out.println("thread-1");
//		System.out.println("ID is: " + thread1.getId());
//		System.out.println("Name is: " + thread1.getName());

		System.out.println("------------------------------------");

		Multithread2 obj3 = new Multithread2();
		Thread thread3 = new Thread(obj3);
		thread3.setPriority(10);
		thread3.start();
		System.out.println("thread-2");

//		for (int i = 0; i < 5; i++) {
//			Multithread2 obj2 = new Multithread2();
//			Thread thread2 = new Thread(obj2);
//			thread2.start();
//		}
	}

}