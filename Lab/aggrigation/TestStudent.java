/*--aggregation assignment 
create a Address class
   mv : city,state,country;  
   parameterized constructor, getter setter, toString

create a Name class
   mv : fname, mname, lname
   parameterized constructor, getter setter, toString

create a Student class
   int rollNo
   Name name 
   Address address
   parameterized constructor, getter setter, toString
   display()

TestStudent
   create a 3 objects of Address,
   create a 3 objects of Name,
   create a 3 objects of Student,
   display the details of 3 students
*/
package aggrigation;

public class TestStudent {

	public static void main(String[] args) {

		Address1 address = new Address1("Jalgaon", "Maharshatra", "India");
		Address1 address1 = new Address1("Pune", "Maharshatra", "India");
		Address1 address2 = new Address1("Mumbai", "Maharshatra", "India");

		Name nm = new Name("Girish", "Ravindra", "Shinde");
		Name nm1 = new Name("Shinde", "Girish", "Ravindra");
		Name nm2 = new Name("Girish", "R", "Shinde");

		Student std = new Student(1, nm, address);
		Student std1 = new Student(2, nm1, address1);
		Student std2 = new Student(3, nm2, address2);

		System.out.println("***Student 1***");
		std.display();
		System.out.println("-----------------------------------");
		System.out.println();

		System.out.println("***Student 2***");
		std1.display();
		System.out.println("-----------------------------------");
		System.out.println();

		System.out.println("***Student 1***");
		std2.display();

	}

}
