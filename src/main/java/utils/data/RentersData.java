package utils.data;

public class RentersData {
	
	private String zipCode;
	private String addres;
	private String apt;
	private String city;
	private String state;
	private String residentType;
	private String firstNmae;
	private String middleIn;
	private String lastname;
	private String dob;
	private String maritalStatus;
	private String email;
	private String socialSec;
	private String computerCoverage;
	private String lawSuits;
	private String claims;
	
	public RentersData(String zipCode, String addres, String apt, String city, String state, String residentType,
			String firstNmae, String middleIn, String lastname, String dob, String maritalStatus, String email,
			String socialSec, String computerCoverage, String lawSuits, String claims) {
		this.zipCode = zipCode;
		this.addres = addres;
		this.apt = apt;
		this.city = city;
		this.state = state;
		this.residentType = residentType;
		this.firstNmae = firstNmae;
		this.middleIn = middleIn;
		this.lastname = lastname;
		this.dob = dob;
		this.maritalStatus = maritalStatus;
		this.email = email;
		this.socialSec = socialSec;
		this.computerCoverage = computerCoverage;
		this.lawSuits = lawSuits;
		this.claims = claims;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getAddres() {
		return addres;
	}

	public String getApt() {
		return apt;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getResidentType() {
		return residentType;
	}

	public String getFirstNmae() {
		return firstNmae;
	}

	public String getMiddleIn() {
		return middleIn;
	}

	public String getLastname() {
		return lastname;
	}

	public String getDob() {
		return dob;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getEmail() {
		return email;
	}

	public String getSocialSec() {
		return socialSec;
	}

	public String getComputerCoverage() {
		return computerCoverage;
	}

	public String getLawSuits() {
		return lawSuits;
	}

	public String getClaims() {
		return claims;
	}

}
