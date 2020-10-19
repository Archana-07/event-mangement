package icsd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class UserDetails {
	
	
	int userId;
	String userName;
	String pwd;
	String emailId;
	long contactNo;
	String userLocation;
	String address;
	String gender;
	String country;
	String state;
	int zip;
	
	
	
	
	
	public UserDetails(String pwd) {
		super();
		this.pwd = pwd;
	}



	///////////////////////////////////////////////////update profile///////////////////////////////
	public UserDetails(String userName, String emailId, long contactNo, String address, String country, String state,
			int zip) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.address = address;
		this.country = country;
		this.state = state;
		this.zip = zip;
	}

	
	
	public UserDetails(String userName, String pwd, String emailId, long contactNo, String userLocation, int zip, String address,
			String gender) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.userLocation = userLocation;
		this.address = address;
		this.gender = gender;
		this.zip = zip;
	}
	
	
	
	
	
	public UserDetails(String pwd, String emailId) {
		super();
		this.pwd = pwd;
		this.emailId = emailId;
	}
	
	
	
	
	
	public UserDetails()
	{
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", pwd=" + pwd + ", emailId=" + emailId + ", contactNo="
				+ contactNo + ", userLocation=" + userLocation + ", address=" + address + ", gender=" + gender
				+ ", zip=" + zip + "]";
	}
}

