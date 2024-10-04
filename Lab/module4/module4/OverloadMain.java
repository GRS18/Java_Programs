//Main method is Successfully overload like other Methods.
package module4;

public class OverloadMain {

	static public void main() {
		System.out.println("main method without parameter ");
	}

	static void main(int a) {
		System.out.println("main method with 1 parameter " + a);
	}

	static public void main(int a, int b) {
		System.out.println("main method with 2 parameters " + a + " " + b);
	}

	public static void main(String[] args) {
		//OverloadMain overloadmain = new OverloadMain();
		OverloadMain.main();
		OverloadMain.main(17);
		OverloadMain.main(80, 99);

	}

}
