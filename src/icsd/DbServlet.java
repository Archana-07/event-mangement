package icsd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class DbHandlerServlet
 */
@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	HibernateDb objDhHibernate=new HibernateDb();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserDetails.class).buildSessionFactory();
		System.out.println("do get fired");
		Session session=factory.getCurrentSession();
		
			System.out.println("object created");
			
			
			
			String strEmail=request.getParameter("txtEmail");
			String strPwd=request.getParameter("txtPwd");
			String strName=request.getParameter("txtName");
		    long longContact=Long.parseLong(request.getParameter("txtContact"));
		    String strGender = request.getParameter("optradio");
		    String strLoc = null,strAdd = null; int intZip = 0;
		    
		    objDhHibernate.insertIntoUserDetails(strName, strPwd,strEmail,  longContact, strLoc, intZip, strAdd, strGender);

		    System.out.println(strEmail+strPwd+strName+longContact+strLoc+intZip+strAdd+strGender);
			
	}

}
