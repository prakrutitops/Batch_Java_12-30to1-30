import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btninsert;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		btninsert = new JButton("Insert");
		
		btninsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				//database connectivity
				
				//data for connection
				String db ="placement";
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				//mysql-connector
				try 
				{
					//connection done
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String fname = tf1.getText().toString();
					String lname = tf2.getText().toString();
					
					String sql = "insert into info values (null,'"+fname+"','"+lname+"')";
					//insert into info (null,'"+fname+"','"+lname+"')
					//query run
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btninsert);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		String db ="placement";
		String host="jdbc:mysql://localhost:3306/";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql = "select * from info";
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(sql);
			System.out.println("ID"+" "+"FNAME"+" "+"LNAME");
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				
				
				System.out.println(id+" "+fname+" "+lname);
			}
			
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
