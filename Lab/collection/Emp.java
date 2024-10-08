package collection;

public class Emp {

	private int eNo;
	private String eName;
	private double salary;

	public Emp() {
		eNo = 0;
		eName = null;
		salary = 0.0;
	}

	public Emp(int eNo, String eName, double salary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eNo=" + eNo + ", eName=" + eName + ", salary=" + salary + "]";
	}

}
