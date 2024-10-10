package lambda;

interface Interface1 {
	void absFun(int x, int y, int z); // abstract method only one abstract method declare in interface

	default void funt1() { // non abstract mthod
		System.out.println("This  is fun name");
	}

	default void fun2() {
		System.out.println("This is fun2");
	}
}

public class MyClass {

	public static void main(String[] args) {
		Interface1 fobj = (int x, int y, int z) -> System.out.println(2 * 40 * 6);
		fobj.absFun(0, 0, 0);

		Interface1 fobj1 = (int x, int y, int z) -> System.out.println(x * y * z);

		fobj1.absFun(3, 4, 1);
		fobj1.absFun(9, 1, 2);
		fobj1.absFun(5, 3, 1);
		fobj1.absFun(4, 8, 7);

		System.out.println("-----------------------------------");
		fobj.funt1();
		fobj.fun2();
	}

}
