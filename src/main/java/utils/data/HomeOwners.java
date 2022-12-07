package utils.data;


public class HomeOwners {
	private String zipCode;
	private String  firstName;
	private String lastName;
	private String dob;
	private String city;
	private String state;

	public HomeOwners(String zipCode, String firstName, String lastName, String dob, String city, String State, String state) {
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.city = city;
		this.state = state; 
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDob() {
		return dob;
	}

	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}

}
