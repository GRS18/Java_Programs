package JavaPrograms1;

public class Student {
	private int rollno;
	private String name;
	private double score;
	
	public void attendClass()
	{
		System.out.println("Attending the class");
	}
	public void appearExam()
	{
		System.out.println("Appearing dfor the Exam");
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

	public static void main(String[] args) {
		Student student = new Student();
		
		student.rollno=1;
		student.name= "Girish";
		student.score=90.89;
		
		student.Display();
		student.attendClass();
		student.appearExam();
		student.completeAssignment();
		
		System.out.println("-------------------------------------------");
		
		Student student1 = new Student();
		
		student1.rollno=1;
		student1.name= "Girish";
		student1.score=90.89;
		
		student1.Display();
		student1.attendClass();
		student1.appearExam();
		student1.completeAssignment();

	}
}
