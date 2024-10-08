//Assignment 1
package collection;

public class Account {

	private int accNo;
	private String name;
	private double bal;

	public Account() {
		accNo = 0;
		name = null;
		bal = 0.0;
	}

	public Account(int accNo, String name, double bal) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", bal=" + bal + "]";
	}
}
