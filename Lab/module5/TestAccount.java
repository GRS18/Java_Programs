package module5;

public class TestAccount {

	public static void main(String[] args) {

		System.out.println("**************Printing object using toString()*****************");

		System.out.println();

		System.out.println("====================Default Constructer======================");
		Account account = new Account();

		account.setAccName("Girish"); // insert value using setter and then Display
		System.out.println(account);

		System.out.println("=================Parameterized Constructor====================");

		Account accoutn1 = new Account(1, "Girish", 900000.678);

		System.out.println(accoutn1);
	}

}
