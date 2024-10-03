package operation;

import entity.Account;

public class AccountOperations {

//Withdraw Amount
	// account : 1, "Girish", 30000
	public boolean withDraw(Account account, double amount) { // 2000

		double bal = account.getBalance(); // 30000

		if (bal < amount) {

			System.out.println("Not Enough Balance!!.....");

			return false;

		} else if (amount < 0) {

			System.out.println("Amount can not be Negative......");

			return false;

		} else {

			bal = bal - amount; // 30000-2000=28000

			account.setBalance(bal); // 28000

			return true;
		}
	}

//Deposit Amount
	// account : 1, "Girish", 30000
	public boolean deposit(Account account, double amount) { // 4000

		double bal = account.getBalance(); // 30000

		if (amount < 0) {

			System.out.println("Amount can not be Negative......");

			return false;

		} else if (amount > 100000) {

			System.out.println("Show the Proof.......");

			return false;

		} else {

			bal = bal + amount; // 30000+4000=34000

			account.setBalance(bal); // 34000

			return true;
		}

	}

//Transfer Amount
	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();

		if (amount < 0) {

			System.out.println("Amount can not be Negative......");

			return false;

		} else if (bal1 < amount) {
			System.out.println("Not Enough Balance......");

			return false;

		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account2.setBalance(bal2);

			return true;
		}

	}

}
