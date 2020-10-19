package icsd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthenticationSupport {
public static HttpSession checkUserAuthentication(HttpServletRequest request) throws AuthenticationException
{
	HttpSession session=request.getSession(false);
	if (session==null)
	{
		throw new AuthenticationException("please login first!!!");
	}
	return session;
}
}
