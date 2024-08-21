import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		List<ProductModel>list = Dao.viewdata();
		out.print("<a href='insertproduct.html'>Add Data</a>");
		out.print("<table border='1'>");
		out.print("<tr><th>Id</th><th>Product Name</th><th>Product Price</th><th>Product Description</th><th>Edit</th><th>Delete</th></tr>");
		for(ProductModel m : list)
		{
			
			out.print("<tr><td>"+m.getId()+"</td><td>"+m.getPname()+"</td><td>"+m.getPprice()+"</td><td>"+m.getPdes()+"</td><td><a href='EditServlet?id="+m.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m.getId()+"'>Delete</a></td></tr>");

			
			
		
			
			
			
//			System.out.println(m.getPname());
//			System.out.println(m.getPprice());
//			System.out.println(m.getPdes());
		}
		out.print("</table>");
		
		
		
	}
}
