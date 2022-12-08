package utils.data;

public class HomeOwnersData {

	private String zipCode;
	private String address;
	private String firstName;
	private String lastName;
	private String dob;
	private String city;
	private String state;
	
	public HomeOwnersData(String zipCode, String address, String firstName, String lastNaame, String dob, String city, String state) {
		this.zipCode = zipCode;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastNaame;
		this.dob = dob;
		this.city = city;
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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
}
