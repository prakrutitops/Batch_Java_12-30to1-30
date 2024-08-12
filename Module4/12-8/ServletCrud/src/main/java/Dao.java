import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	//connection method
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	//signup
	public static int signup(Model m)
	{
		Connection con = Dao.getconnect();//connection call
		
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into users(fname,lname,email,password) values (?,?,?,?)");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPassword());
			
			status = ps.executeUpdate();//run
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	//signin
		public static Model signin(Model m)
		{
			Connection con = Dao.getconnect();//connection call
			
			Model m2 = null;
			
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
				ps.setString(1, m.getEmail());
				ps.setString(2, m.getPassword());
				
				ResultSet set = ps.executeQuery();
				
				while(set.next())
				{
					
					int id = set.getInt(1);
					String fname = set.getString(2);
					String lname = set.getString(3);
					String email = set.getString(4);
					String pass = set.getString(5);
					
					m2 = new Model();
					m2.setId(id);
					m2.setFname(fname);
					m2.setLname(lname);
					m2.setEmail(email);
					m2.setPassword(pass);
				}
				
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return m2;
		}
		
		//productinsert
		public static int pinsert(ProductModel m)
		{
			Connection con = Dao.getconnect();//connection call
			
			int status = 0;
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into product(pname,pprice,pdes) values (?,?,?)");
				ps.setString(1, m.getPname());
				ps.setString(2, m.getPprice());
				ps.setString(3, m.getPdes());
				
				
				status = ps.executeUpdate();//run
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return status;
		}
		
	
	
	
}
