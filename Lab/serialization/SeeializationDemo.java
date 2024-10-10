package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {

	private int empId;
	private String ename;
	private double salary;

	public Emp(int empId, String ename, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class SeeializationDemo {

	public static void main(String[] args) {

		Emp emp = new Emp(1, "Ram", 67000);
		Emp emp1 = new Emp(2, "jay", 66000);
		Emp emp2 = new Emp(3, "Krish", 41000);
		Emp emp3 = new Emp(4, "Sameer", 50000);

		try {

			FileOutputStream fileout = new FileOutputStream("D:\\Girish\\file_emp.txt");

			ObjectOutputStream out = new ObjectOutputStream(fileout);

			out.writeObject(emp);

			FileInputStream fs = new FileInputStream("D:\\Girish\\file_emp.txt");

			ObjectInputStream in = new ObjectInputStream(fs);

			emp = (Emp) in.readObject();
			emp1 = (Emp) in.readObject();
			emp2 = (Emp) in.readObject();
			emp3 = (Emp) in.readObject();
			in.close();

			fs.close();

			in.close();

			out.close();

			fileout.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}

		System.out.println(emp);// use if toString is present
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
//		System.out.println("DeSerialization Successfully............");
//		System.out.println("-------------Emp1-------------");
//		System.out.println("ID is " + emp.getEmpId());
//		System.out.println("Name is " + emp.getEname());
//		System.out.println("Salary is " + emp.getSalary());
//		System.out.println("-------------Emp2-------------");
//		System.out.println("ID is " + emp1.getEmpId());
//		System.out.println("Name is " + emp1.getEname());
//		System.out.println("Salary is " + emp1.getSalary());
//		System.out.println("-------------Emp3-------------");
//		System.out.println("ID is " + emp2.getEmpId());
//		System.out.println("Name is " + emp2.getEname());
//		System.out.println("Salary is " + emp2.getSalary());
//		System.out.println("-------------Emp4-------------");
//		System.out.println("ID is " + emp3.getEmpId());
//		System.out.println("Name is " + emp3.getEname());
//		System.out.println("Salary is " + emp3.getSalary());
	}

}
