package module5;
//POJO Class - Plain Old Java Object
public class Customer {

	private int custId;
	private String name;
	private String mobile;
	private String address;

	public Customer() {
		custId = 0;
		name = null;
		mobile = null;
		address = null;
	}

	public Customer(int custId, String name, String mobile, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

}
