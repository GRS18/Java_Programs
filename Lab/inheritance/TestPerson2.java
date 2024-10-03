//Array of Objects
package inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
		// int[] arr=new int [5];

		Person[] arr = new Person[5];

		arr[0] = new Person("Girish", 22, "M");
		arr[1] = new Person("veer", 20, "M");
		arr[2] = new Person("Rajat", 21, "M");
		arr[3] = new Person("Dhruv", 26, "M");
		arr[4] = new Person("Ram", 24, "M");

		for (int i = 0; i < arr.length; i++) {

			// System.out.println(arr[i]);
			System.out.println(
					arr[i].getName() + " is " + arr[i].getAge() + " years old and Gender is " + arr[i].getGender());
		}

	}

}
