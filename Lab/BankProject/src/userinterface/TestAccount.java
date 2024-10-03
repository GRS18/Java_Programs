package userinterface;

import entity.Account;
import operation.AccountOperations;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account(1, "Girish", 30000);
		Account account1 = new Account(2, "Ram", 40000);
		AccountOperations accountoperations = new AccountOperations();

		int ch;
		String choise;

		Scanner in = new Scanner(System.in);
		System.out.println("***************Welcome it ICICI Bank*****************");
		do {

			System.out.println("1.Accept Details");
			System.out.println("2.Display Details");
			System.out.println("3.Withdarw Amount");
			System.out.println("4.Deposit Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Exit");

			System.out.println("Enter your choise: ");
			ch = in.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accepting the Details");
				break;
			case 2:
				System.out.println("Displaying the Details");
				System.out.println("Account no is: " + account.getAccNo());
				System.out.println("Account holder name: " + account.getAccHolderName());
				System.out.println("Account Balance: " + account.getBalance());
				break;
			case 3:
				System.out.println("Enter the amount to withdraw: ");
				double amount = in.nextDouble();
				boolean result = accountoperations.withDraw(account, amount);
				if (result == true) {
					System.out.println("Withdraw Successful");
					System.out.println("New Balance : " + account.getBalance());
				} else {
					System.out.println("Withraw Operation is Failed");
				}
				break;
			case 4:
				System.out.println("Enter the Amount to Deposit: ");
				amount = in.nextDouble();
				result = accountoperations.deposit(account1, amount);
				if (result == true) {
					System.out.println("Deposit  Successful");
					System.out.println("New Balance : " + account1.getBalance());
				} else {
					System.out.println("Deposit Operation is Failed");
				}
				break;
			case 5:
				System.out.println("Enter Amount Transfer");
				amount = in.nextDouble();

				System.out.println("Old Balance account 1 : " + account.getBalance());
				System.out.println("Old Balance account 2 : " + account1.getBalance());
				result = accountoperations.transfer(account, account1, amount);
				if (result == true) {
					System.out.println("Transfer " + amount + "  Successfully............");
					System.out.println("New Balance account 1 : " + account.getBalance());
					System.out.println("New Balance account 2 : " + account1.getBalance());
				} else {
					System.out.println("Transfer Operation is Failed");
				}
				break;
			case 6:
				System.out.println("Enter Account number to check Balance");
				int no = in.nextInt();
				if (account.getAccNo() == no) {
					System.out.println("Account " + no + " current balance is " + account.getBalance());
				} else if (account1.getAccNo() == no) {
					System.out.println("Account " + no + " current balance is " + account1.getBalance());
				} else {
					System.out.println("Enter Vaild Account No.......");
				}
				break;
			case 7:
				System.out.println("");
				break;
			case 8:
				System.exit(0);
				System.out.println("Thank You For Visiting..................");
			}
			System.out.println("Dou you want to Continue (Y/N)");
			choise = in.next();
		} while (choise.equalsIgnoreCase("Y"));
		System.out.println("Thank You For Visiting..................");
	}

}
