package enumpract;

interface Interface {	//its not 
	String comp = "OOP";

	void fun();
}

//1st method - Outside the class
enum Month implements Interface {
	jan, feb, mar, apr, may;

	public void fun() {
		System.out.println("This is Fun 1");
	}
}

public class EnumDemo {
//	2nd method - inside the class
//	enum Month {
//		jan, feb, mar, apr, may;
//	}

	public static void main(String[] args) {
//		3rd method - inside the main method
//		enum Month {
//			jan, feb, mar, apr, may;
//		}

		// Month month = new Month(); Error: enum class object not created

		Month m = Month.jan;
//	datatype  var
		Month m1 = Month.feb;
		Month m2 = Month.mar;
		Month m3 = Month.apr;
		Month m4 = Month.may;

		System.out.println("m - " + m);
		System.out.println("m1 - " + m1);
		System.out.println("m2 - " + m2);
		System.out.println("m3 - " + m3);
		System.out.println("m4 - " + m4);
		System.out.println("-----------------------------------------");

//		print value using enhance for loop
		System.out.println("Printing value using Enhance for Loop");
		for (Month month : Month.values()) {
			System.out.println(month);
		}

		System.out.println("--------------------------------------");

//		calling the function
		m.fun();

	}

}
