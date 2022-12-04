package utils.data;

public class AutoData {

	private String zip;
	private String firstName;
	private String lastName;
	private String middleIn;
	private String dob;
	private String mailingAddress;
	private String apt;
	private String city;

	public AutoData(String zip, String firstName, String lastName, String middleIn, String dob, String mailingAddress,
			String apt, String city) {
		this.zip = zip;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleIn = middleIn;
		this.dob = dob;
		this.mailingAddress = mailingAddress;
		this.apt = apt;
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleIn() {
		return middleIn;
	}

	public String getDob() {
		return dob;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public String getApt() {
		return apt;
	}

	public String getCity() {
		return city;
	}

}
