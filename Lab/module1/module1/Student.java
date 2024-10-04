package module1;
import java.util.Scanner;
public class Student 
{
	//MV
	private int rollno;
	private String name;
	private double score;
	
	Scanner in=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Rolll no.: ");
		rollno=in.nextInt();
		System.out.println("Enter name: ");
		name=in.next();
		System.out.println("Enter Sacore: ");
		score=in.nextDouble();
	}
	
	//MF
	public void attendClass()
	{
		System.out.println("Attending the class");
	}
	public void appearExam()
	{
		System.out.println("Appearing for Exam");
	}
	public void completeAssignment()
	{
		System.out.println("Assignment Completed");
	}
	void Display()
	{
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
}


