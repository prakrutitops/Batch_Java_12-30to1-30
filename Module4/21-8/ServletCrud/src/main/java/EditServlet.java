import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		ProductModel m = Dao.Edit(id2);
		
		out.print("<form action='EditServlet2' method='post'>");
		
		out.print("<input type='hidden' name='id' value='"+m.getId()+"'/>");
		out.print("<br>");
		out.print("Enter Your Product Name:<input type='text' name='pname' value='"+m.getPname()+"'/>");
		out.print("<br>");
		out.print("Enter Your Product Price:<input type='text' name='pprice' value='"+m.getPprice()+"'/>");
		out.print("<br>");
		out.print("Enter Your Product Description:<input type='text' name='pdes' value='"+m.getPdes()+"'/>");
		out.print("<br>");
		out.print("<input type='submit' value='update'/>");
		out.print("</form>");
		
	}
}
