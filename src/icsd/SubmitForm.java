package icsd;



public class SubmitForm {

	
	public SubmitForm()
	{
		
	}
	
	String UserName,StreetAddress,City,State,Country,Email,PhoneNo,Birthdate,Position,Graduation,PostGrad,DesiredEmplmnt,CustomerServicing,HiringReason;
	int ZipCode;
	
	@Override
	public String toString() {
		return "SubmitForm [UserName=" + UserName + ", StreetAddress=" + StreetAddress + ", City=" + City + ", State="
				+ State + ", Country=" + Country + ", Email=" + Email + ", PhoneNo=" + PhoneNo + ", Birthdate="
				+ Birthdate + ", Position=" + Position + ", Graduation=" + Graduation + ", PostGrad=" + PostGrad
				+ ", DesiredEmplmnt=" + DesiredEmplmnt + ", CustomerServicing=" + CustomerServicing + ", HiringReason="
				+ HiringReason + ", ZipCode=" + ZipCode + "]";
	}
	
	
	public SubmitForm(String userName, String streetAddress, String city, String state, String country, String email,
			String phoneNo, String birthdate, String position, String graduation, String postGrad,
			String desiredEmplmnt, String customerServicing, String hiringReason, int zipCode) {
		super();
		this.UserName = userName;
		this.StreetAddress = streetAddress;
		this.City = city;
		this.State = state;
		this.Country = country;
		this.Email = email;
		this.PhoneNo = phoneNo;
		this.Birthdate = birthdate;
		this.Position = position;
		this.Graduation = graduation;
		this.PostGrad = postGrad;
		this.DesiredEmplmnt = desiredEmplmnt;
		this.CustomerServicing = customerServicing;
		this.HiringReason = hiringReason;
		this.ZipCode = zipCode;
	}

	
	
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.StreetAddress = streetAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.PhoneNo = phoneNo;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.Birthdate = birthdate;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		this.Position = position;
	}
	public String getGraduation() {
		return Graduation;
	}
	public void setGraduation(String graduation) {
		this.Graduation = graduation;
	}
	public String getPostGrad() {
		return PostGrad;
	}
	public void setPostGrad(String postGrad) {
		this.PostGrad = postGrad;
	}
	public String getDesiredEmplmnt() {
		return DesiredEmplmnt;
	}
	public void setDesiredEmplmnt(String desiredEmplmnt) {
		this.DesiredEmplmnt = desiredEmplmnt;
	}
	public String getCustomerServicing() {
		return CustomerServicing;
	}
	public void setCustomerServicing(String customerServicing) {
		this.CustomerServicing = customerServicing;
	}
	public String getHiringReason() {
		return HiringReason;
	}
	public void setHiringReason(String hiringReason) {
		this.HiringReason = hiringReason;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public void setZipCode(int zipCode) {
		this.ZipCode = zipCode;
	}

	
	
	
	

}
