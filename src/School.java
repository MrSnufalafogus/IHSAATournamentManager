import java.util.UUID;

public class School {
	
	String SchoolID;
	String SchoolName;
	String Address;
	String City;
	String StateCode;
	String Zip;
	String CountyName;
	String Phone;
	String Fax;
	int EnrollmentAmount;
	
	public School(String SchoolID, String SchoolName, String Address, String City, String StateCode, String Zip, String CountyName, String Phone, String Fax, int EnrollmentAmount) {
		
		this.SchoolID = SchoolID;
		this.SchoolName = SchoolName;
		this.Address = Address;
		this.City = City;
		this.StateCode = StateCode;
		this.Zip = Zip;
		this.CountyName = CountyName;
		this.Phone = Phone;
		this.Fax = Fax;
		this.EnrollmentAmount = EnrollmentAmount;
		
	}

	public String getSchoolID() {
		return SchoolID;
	}

	public void setSchoolID(String schoolID) {
		SchoolID = schoolID;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStateCode() {
		return StateCode;
	}

	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getCountyName() {
		return CountyName;
	}

	public void setCountyName(String countyName) {
		CountyName = countyName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public int getEnrollmentAmount() {
		return EnrollmentAmount;
	}

	public void setEnrollmentAmount(int enrollmentAmount) {
		EnrollmentAmount = enrollmentAmount;
	}
	

}
