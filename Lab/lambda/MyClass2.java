package lambda;

interface Interface2 {
	void absFun(int x); // abstract method only one abstract method declare in interface

}

public class MyClass2 {

	public static void main(String[] args) {

		Interface2 fobj = (int x) -> System.out.println(x * x * x);

		fobj.absFun(3);
		fobj.absFun(9);
		fobj.absFun(5);
		fobj.absFun(12);

	}

}
