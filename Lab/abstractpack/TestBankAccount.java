package abstractpack;

abstract class BankAccount {
	protected int id;
	protected float balance;

	public  BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	abstract public float calculateInterest();

}

class CurrentAccount extends BankAccount {

	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateInterest() {

		return (balance * 0.07f);
	}

}

class LoanAccount extends BankAccount {

	public LoanAccount(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateInterest() {

		return (balance * 0.1f);
	}

}

class SavingAccount extends BankAccount {

	public SavingAccount(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateInterest() {

		return (balance * 0.56f);
	}

}

public class TestBankAccount {

	public static void main(String[] args) {

		float l;
		CurrentAccount ca = new CurrentAccount(1, 20000);
		System.out.println(ca.calculateInterest());
		System.out.println("------------------------------------------");

		LoanAccount la = new LoanAccount(2, 50000);
		System.out.println(la.calculateInterest());
		System.out.println("------------------------------------------");

		SavingAccount sa = new SavingAccount(3, 90000);
		System.out.println(sa.calculateInterest());
//return l=la.calculateInterest();
	}

}
