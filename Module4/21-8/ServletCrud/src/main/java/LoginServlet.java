import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();//when you want to print anything on webpage
		
		
		String em = req.getParameter("email");
		String ps = req.getParameter("password");
		
		Model m = new Model();
		m.setEmail(em);
		m.setPassword(ps);
		
		Model m2 = Dao.signin(m);
		
		if(m2!=null)
		{
			resp.sendRedirect("dashboard.html");
		}
		else
		{
			out.print("Login Fail");
		}
	
	
		
	}
	
}
