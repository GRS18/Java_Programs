package staticnested;

class OuterClass {

	private static String msg = "Wlcome to nested class";

	// static nested class
	public static class NestedStaticClass {

		// can access only static mv
		public void printMessage() {
			System.out.println("Message from nested static class: " + msg);
		}
	}

	// non static nested class/called inner class
	public class Innerclass {
		// both static and non static member of outer class accessible here
		public void display() {
			System.out.println("Message from non-static nested class: " + msg);
		}
	}
}

public class ClasesNested {

	public static void main(String[] args) {
		// 1 object is created to call method of static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		printer.printMessage();

		// 2 object is created to call method of non Static class
		OuterClass outer = new OuterClass();
		OuterClass.Innerclass inner = outer.new Innerclass();
		inner.display();

	}

}
