package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.ProductModel;
import com.model.SignupModel;

public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing2","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int signup(SignupModel m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup(fullname,email,phone,password) values (?,?,?,?)");
	
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static SignupModel login(SignupModel m)
	{
		Connection con = Dao.getconnect();
		SignupModel m2 =null;	
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password =?");
	
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String fullname =set.getString(2);
				String email = set.getString(3);
				String phone = set.getString(4);
				String password = set.getString(5);
				
				m2 = new SignupModel();
				m2.setId(id);
				m2.setFullname(fullname);
				m2.setEmail(email);
				m2.setPassword(password);
				m2.setPhone(phone);
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		return m2;
	}
	
	public static List<ProductModel> viewproducts()
	{
		
		List<ProductModel> plist = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
		
			while(set.next())
			{
				
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				 
				byte[] imgData = set.getBytes(5);
				String encode = Base64.getEncoder().encodeToString(imgData);
				
				 ProductModel pm = new ProductModel();
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				pm.setP_image(encode);	
				
				plist.add(pm);
				
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return plist;
		
	}
	
	
	
	
	
}
