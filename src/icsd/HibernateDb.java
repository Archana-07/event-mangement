package icsd;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hsqldb.lib.Iterator;


public class HibernateDb {
	
	public void insertIntoUserDetails(String userName, String pwd, String emailId, long contactNo, String userLocation, int zip, String address,
			String gender)
	{
		
		System.out.println("do get fired");
		 SessionFactory sessFact = HibernateUtil.getSessionFactory();
		  Session sess = sessFact.getCurrentSession();
		  org.hibernate.Transaction trans = sess.beginTransaction();

		  System.out.println("object created");
		  UserDetails userObj = new UserDetails();
		                                                             
		  userObj.setUserName(userName);
		  userObj.setEmailId(emailId);
		  userObj.setPwd(pwd);
		  userObj.setContactNo(contactNo);
		  userObj.setUserLocation(userLocation);
		  userObj.setZip(zip);
		  userObj.setAddress(address);
		  userObj.setGender(gender);
		 
		  
		  sess.save(userObj);
		  trans.commit();
		  System.out.println("Successfully inserted");
		
		
			
	}
	
	
	public void getAllbyEmailPwd(String emailId,String pwd)
	{
		System.out.println("do get fired");
		 SessionFactory sessFact = HibernateUtil.getSessionFactory();
		  Session sess = sessFact.getCurrentSession();
		  org.hibernate.Transaction trans = sess.beginTransaction();
		  
		 
		  Query qry=sess.createQuery("from UserDetails u where u.emailId=? and u.pwd=?");
		  

		  qry.setParameter(0,emailId);
		  qry.setParameter(1,pwd);
		  List list=qry.list();
		  java.util.Iterator it=list.iterator();		  
		  while(it.hasNext())
		  {
			Object o=(Object)it.next();  
			UserDetails userbj=(UserDetails)o;
			System.out.println(userbj.getAddress());
			System.out.println(userbj.getContactNo());
			System.out.println(userbj.getGender());
			System.out.println(userbj.getUserLocation());
			System.out.println(userbj.getZip());
			
		  }
		  System.out.println("object created");
		  
		  sess.close();
	}
	

}
