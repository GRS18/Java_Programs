package module5;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter roll no, Name, Score");
		int rollno = in.nextInt();
		String name = in.next();
		float score = in.nextFloat();

		Student student = new Student();

		student.setRollNo(rollno);
		student.setName(name);
		student.setScore(score);

		// student.display();

		// student display using getter method
		System.out.println("Roll no: " + student.getRollNo());
		System.out.println("Name: " + student.getName());
		System.out.println("Score: " + student.getScore());

		System.out.println("=========================================");

		Student student2 = new Student(2, "Girish", 88.90f);

		// student2.display();

		// student display using getter method
		System.out.println("Roll no: " + student2.getRollNo());
		System.out.println("Name: " + student2.getName());
		System.out.println("Score: " + student2.getScore());
		
		System.out.println("===================change data===================");
		
		//without taking user input
//		student2.setName("Ram");
//		System.out.println("New Name is "+student2.getName());
		
		//take user input
		System.out.println("Changing the name");
		System.out.println("Enter the new Name: ");
		String name1=in.next();
		student2.setName(name1);
		System.out.println("New Name is "+student2.getName());
		
	}

}
