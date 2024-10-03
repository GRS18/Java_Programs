package module5;

public class Account {

	private int accNo;
	private String accName;
	private double accBalance;

	public Account() {
		accNo = 0;
		accName = null;
		accBalance = 0.0;
	}

	public Account(int accNo, String accName, double accBalance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}

}
