import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("<style>");
        out.println("body {");
        out.println("  margin: 0;");
        out.println("  font-family: Arial, Helvetica, sans-serif;");
        out.println("}");
        out.println(".topnav {");
        out.println("  overflow: hidden;");
        out.println("  background-color: #333;");
        out.println("}");
        out.println(".topnav a {");
        out.println("  float: left;");
        out.println("  color: #f2f2f2;");
        out.println("  text-align: center;");
        out.println("  padding: 14px 16px;");
        out.println("  text-decoration: none;");
        out.println("  font-size: 17px;");
        out.println("}");
        out.println(".topnav a:hover {");
        out.println("  background-color: #ddd;");
        out.println("  color: black;");
        out.println("}");
        out.println(".topnav a.active {");
        out.println("  background-color: #04AA6D;");
        out.println("  color: white;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='topnav'>");
        out.println("  <a href='#home'>Home</a>");
        out.println("  <a href='#contact'>Contact</a>");
        out.println("  <a href='#about'>About</a>");
        
        out.println("</div>");
        out.println("<div style='padding-left:16px'>");
        out.println("  <h2>Top Navigation Example</h2>");
        out.println("  <p>Some content..</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
		
		
		
		
		HttpSession sess = req.getSession();
		
		
		if(sess.getAttribute("mylogin")!=null)
		{
			out.println("<a href='LogoutServlet'>Logout</a>");
			
			
		
		}
		else
		{
			
		}
		
		
	}
}
