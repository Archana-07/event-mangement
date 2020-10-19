package icsd;

public class Careers {


String  strclocation,streligibility,strDepartment,strPosition,strSalary,strimage;

int intcarrerId;










public Careers(String streligibility, String strPosition, String strSalary, String strimage) {
	super();
	this.streligibility = streligibility;
	this.strPosition = strPosition;
	this.strSalary = strSalary;
	this.strimage = strimage;
}



public Careers()
{
	
}



@Override
	public String toString() {
		return "Careers [strclocation=" + strclocation + ", streligibility=" + streligibility + ", strDepartment="
				+ strDepartment + ", strPosition=" + strPosition + ", strSalary=" + strSalary + ", strimage=" + strimage
				+ ", intcarrerId=" + intcarrerId + "]";
	}


public Careers(int intcarrerId, String strclocation, String streligibility, String strDepartment,
		String strPosition, String strSalary, String strimage) {
	super();
	this.strclocation = strclocation;
	this.streligibility = streligibility;
	this.strDepartment = strDepartment;
	this.strPosition = strPosition;
	this.strSalary = strSalary;
	this.strimage = strimage;
	this.intcarrerId = intcarrerId;
}



public String getStrclocation() {
		return strclocation;
	}

	public void setStrclocation(String strclocation) {
		this.strclocation = strclocation;
	}

	public String getStreligibility() {
		return streligibility;
	}

	public void setStreligibility(String streligibility) {
		this.streligibility = streligibility;
	}

	public String getStrDepartment() {
		return strDepartment;
	}

	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}

	public String getStrPosition() {
		return strPosition;
	}

	public void setStrPosition(String strPosition) {
		this.strPosition = strPosition;
	}

	public String getStrSalary() {
		return strSalary;
	}

	public void setStrSalary(String strSalary) {
		this.strSalary = strSalary;
	}

	public String getStrimage() {
		return strimage;
	}

	public void setStrimage(String strimage) {
		this.strimage = strimage;
	}

	public int getIntcarrerId() {
		return intcarrerId;
	}

	public void setIntcarrerId(int intcarrerId) {
		this.intcarrerId = intcarrerId;
	}


	
}