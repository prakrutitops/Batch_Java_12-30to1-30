import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();//when you want to print anything on webpage
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String pname = req.getParameter("pname");
		String pprice = req.getParameter("pprice");
		String pdes = req.getParameter("pdes");
	
		
		
	
		//out.print(id+" "+pname+" "+pprice+" "+pdes);
	
		//data set in Model
		ProductModel m = new ProductModel();
		m.setId(id2);
		m.setPname(pname);
		m.setPprice(pprice);
		m.setPdes(pdes);
		
		int status = Dao.pupdate(m);
		
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
	}
	
}
