import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		
		public static List<ProductModel>viewdata()
		{
			Connection con = Dao.getconnect();
			List<ProductModel>list = new ArrayList<>();
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from product");
				ResultSet set = ps.executeQuery();
				
				while(set.next())
				{
					int id = set.getInt(1);
					String pname = set.getString(2);
					String pprice = set.getString(3);
					String pdes = set.getString(4);
				
					ProductModel m = new ProductModel();
					m.setId(id);
					m.setPname(pname);
					m.setPprice(pprice);
					m.setPdes(pdes);
					
					list.add(m);
				}
				
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return list;
		}
		
		//productdelete
				public static int pdelete(int id)
				{
					Connection con = Dao.getconnect();//connection call
					
					int status = 0;
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("delete from product where id =?");
						
						ps.setInt(1,id);
				
						
						status = ps.executeUpdate();//run
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return status;
				}
		
				//get-fetch for edit
				public static ProductModel Edit(int id)
				{
					Connection con = Dao.getconnect();//connection call
					
					int status = 0;
					ProductModel m =null;
					try 
					{
						PreparedStatement ps = con.prepareStatement("select * from product where id=?");
						ps.setInt(1,id);
						
						ResultSet set = ps.executeQuery();
						
						if(set.next())
						{
							int id2 = set.getInt(1);
							String pname = set.getString(2);
							String pprice = set.getString(3);
							String pdes = set.getString(4);
						
							 m = new ProductModel();
							m.setId(id2);
							m.setPname(pname);
							m.setPprice(pprice);
							m.setPdes(pdes);
						}
						
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return m;
				}
				//update
				public static int pupdate(ProductModel m)
				{
					Connection con = Dao.getconnect();//connection call
					
					int status = 0;
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("update product set pname=?,pprice=?,pdes=? where id=?");
						ps.setString(1, m.getPname());
						ps.setString(2, m.getPprice());
						ps.setString(3, m.getPdes());
						ps.setInt(4, m.getId());
						
						
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
