package aggrigation;

class Address1 {
	String city, state, country;

	public Address1(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "[city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}

class Name {

	String fname;
	String mname;
	String lname;

	public Name(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "[fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
}

class Student {
	int id;
	Name name;
	Address1 address;

	public Student(int id, Name name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void display() {

		System.out.println("----------------------PRINT USING toString METHOD ----------------------");
		System.out.println("ADDRESS - " + address);
		System.out.println("NAME - " + name);
		System.out.println("--------------------PRINT USING display METHOD-------------------------");
		System.out.println("Roll no is " + id);
		System.out.println("name is " + name.fname + " " + name.mname + " " + name.lname);
		System.out
				.println("city is " + address.city + " State is " + address.state + " Country is " + address.country);
	}
}