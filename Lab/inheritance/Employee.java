package inheritance;

public class Employee extends Student {

	private int empNo;
	private String company;
	private double salary;

	public Employee(String name, int age, String gender, int rollNo, String stream, double score, int empNo,
			String company, double salary) {
		super(name, age, gender, rollNo, stream, score);
		this.empNo = empNo;
		this.company = company;
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		super.fun1();
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", company=" + company + ", salary=" + salary + ", rollNo=" + rollNo
				+ ", stream=" + stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}
}
