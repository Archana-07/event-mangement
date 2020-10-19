
package icsd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import oracle.jdbc.pool.OracleDataSource;


public class DbHandlerEvent
{
	PreparedStatement stmt; 
	ResultSet rset;
	
	public Connection getDBCon()
	{
		Connection con=null;
		try {
			OracleDataSource ods=new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			con=ods.getConnection("ashu", "icsd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	 
	
	/////////////////change password////////////////////////////////////////////
	
	
	public String getCurntPwdByUserId(int userId)
	{
		
		Connection con=getDBCon();
		
		String pwd = null;
		try {
			stmt=con.prepareStatement("select pwd from UserDetails by userId=?");
			
			stmt.setInt(1, userId);
			rset=stmt.executeQuery();
			
			
			pwd=rset.getString("pwd");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pwd;
	}
	
	//////////////////////update current pwd///////////////////////////////////////
	
	public void updCurntPwd(int userId,String pwd)
	{
		
	Connection con=getDBCon();
	
	
	try {
		stmt=con.prepareStatement("update  UserDetails set pwd=? where userId=? ");
		
	stmt.setInt(2,userId);
	stmt.setString(1, pwd);
	
	stmt.executeUpdate();
	
	
	UserDetails obj =new UserDetails(pwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	
	
	
//////////////update profile/////////////////fuction call by emailid//////////////////////////////////////
	
	public int getIdByEmail(String emailId)
	{
		
		Connection con =getDBCon();
		int userId =0;
		
		try {
			stmt=con.prepareStatement("select userId from UserDetails where emailId=?");
			
			stmt.setString(1,emailId);
			
			rset=stmt.executeQuery();
			if(rset.next())
			{
				userId=rset.getInt("userId");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userId;
	}
	
	
///////////////////////////////////////VALIDITY OF USER///////////////////////////////

public boolean isValidUser(String emailId, String pwd)
{
Connection con=getDBCon();
boolean res=false;
try {
stmt=con.prepareStatement("select * from UserDetails where emailId=? and pwd=?");

stmt.setString(1,emailId);
stmt.setString(2,pwd);

rset=stmt.executeQuery();
if(rset.next())
{
res=true;
}
else
{
res=false;
}
con.close();
} 
catch (SQLException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
return res;

}
	
	
	
	
	public void insertSubmitForm(String UserName,String StreetAddress, String City, String State,
			int ZipCode,String Country,String Email,Long PhoneNo,
			String Birthdate, String Position, String Graduation,String PostGrad, 
			String DesiredEmplmnt,String CustomerServicing,String HiringReason)
	
	{
		
		Connection con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into SubmitForm (jobId,UserName,StreetAddress,City,State,ZipCode,Country,Email,PhoneNo,Birthdate,Position,Graduation,PostGrad,DesiredEmplmnt,CustomerServicing,HiringReason) values(jobSeq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
//			  jobId int primary key,
//			  UserName varchar(20),
//			  StreetAddress varchar(30),
//			  City varchar(20),
//			  State varchar(20),
//			  ZipCode number(20),
//			  Country varchar(30),
//			  Email varchar(40),
//			  PhoneNo number(30),
//			  Birthdate varchar(30),
//			  Position varchar(30),
//			  Graduation varchar(30),
//			  PostGrad varchar (30),
//			  DesiredEmplmnt varchar(30),
//			  CustomerServicing  varchar(60),
//			  HiringReason varchar(60));
			stmt.setString(1,UserName);
			stmt.setString(2,StreetAddress);
			stmt.setString(3,City);
			stmt.setString(4,State);
			stmt.setInt(5,ZipCode);
			stmt.setString(6,Country);
			stmt.setString(7,Email);
			stmt.setLong(8,PhoneNo);
			stmt.setString(9,Birthdate);
			stmt.setString(10,Position);
			stmt.setString(11,Graduation);
			stmt.setString(12,PostGrad);
			stmt.setString(13,DesiredEmplmnt);
			stmt.setString(14,CustomerServicing);
			stmt.setString(15,HiringReason);
			
			
			rset=stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertUserDetails(String userName,String emailId, long contactNo,String pwd, String userLocation, int zip, String address,
			String gender)
	{
		Connection con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into UserDetails(userId,userName,emailId,contactNo,pwd,userLocation,zip,address,gender) "
					+ "values (userSeq.nextval,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1,userName);
			stmt.setString(2,emailId);
			stmt.setLong(3,contactNo);
			stmt.setString(4,pwd);
			stmt.setString(5,userLocation);
			stmt.setInt(6,zip);
			stmt.setString(7,address);
			stmt.setString(8,gender);
			
			rset=stmt.executeQuery();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
/////////////////////////////////////////update profile/////////////////////
	
	public void updateUserDetails(int userId,String userName,String emailId,long contactNo,String country,String state,String address,int zip)
	{
		Connection con=getDBCon();
		
		
		
		try {
			stmt=con.prepareStatement("update  UserDetails set userName=?, emailId=?,contactNo=?,country=?,state=?,address=?,zip=? where userId=?");
			stmt.setInt(8, userId);
			stmt.setString(1, userName);
			stmt.setString(2, emailId);
			stmt.setLong(3, contactNo);
			stmt.setString(4, country);
			stmt.setString(5, state);
			stmt.setString(6, address);
			stmt.setInt(7, zip);
			
			stmt.executeUpdate();
			
			UserDetails obj=new UserDetails(userName, emailId, contactNo, address, country, state, zip);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public void insertOurTalents(String tname,int age, String gender,String email, Long contactNo, String address, String profession,
			float rate,String image)
	{
		Connection con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into OurTalents(utId,tname,age,gender,email,contactNo,address,profession,rate,image) "
					+ "values (ourtalSeq.nextval,?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1,tname);
			stmt.setInt(2,age);
			stmt.setString(3,gender);
			stmt.setString(4,email);
			stmt.setLong(5,contactNo);
			stmt.setString(6,address);
			stmt.setString(7,profession);
			stmt.setFloat(8,rate);
			stmt.setString(9,image);
			
			rset=stmt.executeQuery();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public LinkedList<Careers> getCarTable()
	{
		LinkedList<Careers> lst=new LinkedList<>();
		  Connection con =null;
		
		
		try {
			con=getDBCon();
			PreparedStatement stmt=con.prepareStatement("select * from Careers ");
			ResultSet rset=stmt.executeQuery();
			
			while(rset.next())
			{
				String  strclocation,streligibility,strDepartment,strPosition,strSalary,strimage;
				  
				int intcarrerId;
//				CARRERID         NUMBER(38)   
//				CLOCATION        VARCHAR2(30) 
//				ELIGIBILITY      VARCHAR2(30) 
//				DEPARTMENT       VARCHAR2(30) 
//				POSITION         VARCHAR2(30) 
//				SALARY           VARCHAR2(40) 
//				IMAGE            VARCHAR2(30)
				
				intcarrerId=rset.getInt("CARRERID");
				strclocation=rset.getString("CLOCATION");
				streligibility=rset.getString("ELIGIBILITY");
				strDepartment=rset.getString("DEPARTMENT");
				strPosition=rset.getString("POSITION");
				strSalary=rset.getString("SALARY");
				strimage=rset.getString("IMAGE");
				
				Careers obj=new Careers(intcarrerId, strclocation, streligibility, strDepartment, strPosition, strSalary, strimage);
				lst.add(obj);
				
				System.out.println(strclocation+streligibility+strDepartment+strPosition+strSalary+strimage+intcarrerId);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	
	/////////////////////////////////////////////reteriving position///////////////////////////////
	public  LinkedList<Careers> getALLByLocDeptFromCareers(String strclocation, String strDepartment)
	{
	Connection con=getDBCon();
	String strPosition ,streligibility,strSalary,strimage;
	LinkedList<Careers>  lst=new LinkedList<>();
	{
		
		
		try {
			stmt=con.prepareStatement("select * from  Careers where location=? and department=?");
			
			stmt.setString(1, strclocation);

			stmt.setString(2, strDepartment);
			
			rset=stmt.executeQuery();
			while(rset.next())
			{
				strPosition=rset.getString("position");
				streligibility=rset.getString("eligibility");
				strSalary=rset.getString("Salary");
				strimage=rset.getString("image");
				
				Careers obj=new Careers(strPosition,streligibility,strSalary,strimage);
				lst.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return lst;
	}
	
}
	

	
}

