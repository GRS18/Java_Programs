package aggrigation;

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Emp {
	int id;
	String name;
	Address address; // has a relationship ::aggregation (create reference of class Address)

	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("id is " + id);
		System.out.println("name  is " + name);
		System.out.println("city is " + address.city + " State is " + address.state + " Country is " + address.state);
	}

}

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address("Jalgaon", "Maharshatra", "India");
		Address address1 = new Address("Pune", "Maharshatra", "India");

		Emp emp = new Emp(1, "GRS", address);
		Emp emp1 = new Emp(2, "SRG", address1);

		emp.display();
		System.out.println("*-------------------------------------*");
		emp1.display();

	}

}
