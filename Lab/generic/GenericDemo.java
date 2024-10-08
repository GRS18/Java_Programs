package generic;

class MyClass {

	public <E> void printArray(E[] arr1) {
		// method E[]-datatype arr1-name of arry

		for (E i : arr1) {
			System.out.println(i);
		}

		System.out.println("---------------------------");
	}

}

public class GenericDemo {

	public static void main(String[] args) {

		MyClass myclass = new MyClass();
		// pass integer array

		Integer[] arrint = { 11, 22, 33, 44, 55, 66 };
		myclass.printArray(arrint);

		Double[] arrdouble = { 22.3, 90.7, 33.7, 85.88, 3.2, 6.6 };
		myclass.printArray(arrdouble);

		Float[] arrfloat = { 2.3f, 9.7f, 3.7f, 8.88f, 37.2f, 6.69f };
		myclass.printArray(arrfloat);

		Character[] arrchar = { 'G', 'I', 'r', 'I', 'S', 'H' };
		myclass.printArray(arrchar);

		String[] arrstring = { "GIRISH", "ravindra", "Shinde" };
		myclass.printArray(arrstring);

		Boolean[] arrbool = { true, false };
		myclass.printArray(arrbool);

		Byte[] arrbyte = { 10, 20, 30 };
		myclass.printArray(arrbyte);

	}

}
