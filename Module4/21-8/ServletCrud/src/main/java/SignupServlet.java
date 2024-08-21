import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class SignupServlet extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();//when you want to print anything on webpage
		
		String fn = req.getParameter("fname");
		String ln = req.getParameter("lname");
		String em = req.getParameter("email");
		String ps = req.getParameter("password");
	
	
		//out.print(fn+" "+ln+" "+em+" "+ps);
	
		//data set in Model
		Model m = new Model();
		m.setFname(fn);
		m.setLname(ln);
		m.setEmail(em);
		m.setPassword(ps);
		
		int status = Dao.signup(m);
		
		if(status>0)
		{
			//out.print("success");
			resp.sendRedirect("login.html");
		}
		else
		{
			out.print("fail");
		}
		
		
	}
	
}
