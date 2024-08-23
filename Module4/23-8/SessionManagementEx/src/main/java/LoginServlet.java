import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();//when you want to print anything on webpage
		
		HttpSession sess = req.getSession();
		if(sess.getAttribute("mylogin")!=null)
		{
			resp.sendRedirect("DashboardServlet");
		}
		else
		{
			String em = req.getParameter("email");
			String ps = req.getParameter("password");
			
			Model m = new Model();
			m.setEmail(em);
			m.setPassword(ps);
			
			Model m2 = Dao.signin(m);
			
			if(m2!=null)
			{
				
				
				sess.setAttribute("mylogin",true);
				resp.sendRedirect("DashboardServlet");
			}
			else
			{
				out.print("Login Fail");
			}
		}
		
		
	
	
		
	}
	
}
