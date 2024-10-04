package module4;

class MyClass2 {
	public void MayFun2() {
		System.out.println("This is fun 2");
	}
}

class MyClass1 {
	public void MayFun1() {
		System.out.println("This is fun 1");
	}
}

public class MyClass {

	public static void main(String[] args) {
		MyClass1 myclass1 = new MyClass1();
		myclass1.MayFun1();
		MyClass2 myclass2 = new MyClass2();
		myclass2.MayFun2();

	}

}
