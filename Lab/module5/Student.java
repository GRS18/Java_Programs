package module5;

public class Student {

	private int rollNo;
	private String name;
	private float score;

//	public Student() {
//		System.out.println("It is Default Constructor");
//		rollNo = 0;
//		name = "";
//		score = 0.0f;
//	}

	// Automatic Default constructor (ctrl+spacebar)
	public Student() {
	//	System.out.println("It is Default Constructor");
		rollNo = 0;
		name = "";
		score = 0.0f;
	}

//	public Student(int rollno, String name, float score) {
//		System.out.println("This is Prameterized Constructor ");
//		
//		//this is current object
//		this.rollNo = rollno;
//	
//		//
//		this.name = name;
//		this.score = score;
//	}

	// Automatic Getter Setter Generate (right key--> source--> Generate getter and setter)
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	// Automatic Create Constructor: (right key--> source--> -->generate constructor using feild)
	public Student(int rollNo, String name, float score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
	}
//	Display Data using getter function in main(TestStudent)
//	public void display() {
//		System.out.println("Roll no: " + rollNo);
//		System.out.println("Name: " + name);
//		System.out.println("Score: " + score);
//	}
}
