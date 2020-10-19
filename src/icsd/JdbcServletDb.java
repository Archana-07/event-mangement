package icsd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.ucanaccess.jdbc.Session;

/**
 * Servlet implementation class JdbcServletDb
 */
@WebServlet("/JdbcServletDb")
public class JdbcServletDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DbHandlerEvent objDb=new DbHandlerEvent();
	UserDetails userObj;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcServletDb() {
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
		// TODO Auto-generated method stub
		String strName=request.getParameter("txtName");
		String strEmail=request.getParameter("txtEmail");
		long longContact=Long.parseLong(request.getParameter("txtContact"));
		String strPwd=request.getParameter("txtPwd");
		
		
	    String strGender = request.getParameter("optradio");
	    String strLoc = null,strAdd = null; int intZip = 0;
	    
		HttpSession session=request.getSession();
	    session.setAttribute("emailId", strEmail);
	    
	    
	    objDb.insertUserDetails(strName,strEmail,longContact,strPwd, strLoc,intZip, strAdd,strGender);
	    System.out.println(strEmail+strPwd+strName+longContact+strLoc+intZip+strAdd+strGender);
	}

}
