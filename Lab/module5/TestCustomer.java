package module5;

public class TestCustomer {

	public static void main(String[] args) {

		System.out.println("=======================Default ConstructorS==========================S");
		Customer customer = new Customer();

//		System.out.println("Customer Id: " + customer.getCustId());
//		System.out.println("Customer Name: " + customer.getName());
//		System.out.println("Customer Mobile Number: " + customer.getMobile());
//		System.out.println("Customer Address: " + customer.getAddress());

		System.out.println(customer);

		System.out.println("===================Parameterized Constructer=========================");
		Customer customer1 = new Customer(2, "Girish", "(+91)1212 2323 78", "Ram Bhavan,Nashik");

//		System.out.println("Customer Id: " + customer1.getCustId());
//		System.out.println("Customer Name: " + customer1.getName());
//		System.out.println("Customer Mobile Number: " + customer1.getMobile());
//		System.out.println("Customer Address: " + customer1.getAddress());

		System.out.println(customer1);

	}

}
