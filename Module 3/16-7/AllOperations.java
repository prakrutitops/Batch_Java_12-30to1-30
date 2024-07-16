import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton btninsert,btndelete,btnupdate,btnedit;
	JPanel jp,jp2;
	
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
	public void updatedata()
	{
		updateframe = new JFrame();
		
		tf3 = new JTextField(15);
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		
		btnupdate = new JButton("Update");
		btnedit = new JButton("Edit");
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		jp.add(tf3);
		jp.add(btnupdate);
		
		btnupdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				jp2.setVisible(true);
				jp.setVisible(false);
				
				String db ="placement";
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String id = tf3.getText().toString();
					int id2 = Integer.parseInt(id);
					
					String sql ="select * from info where id='"+id2+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						int id1 = set.getInt(1);
						String name = set.getString(2);
						String surname = set.getString(3);
					
						tf1.setText(name);
						tf2.setText(surname);
						
						btnedit.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							
								try 
								{
									Class.forName("com.mysql.jdbc.Driver");
									Connection con = DriverManager.getConnection(url,"root","");
									
									String name = tf1.getText().toString();
									String surname = tf2.getText().toString();
									
									String sql ="update info set fname='"+name+"',lname='"+surname+"' where id='"+id1+"'";
									
									Statement stmt = con.createStatement();
									int data = stmt.executeUpdate(sql);
									
									if(data>0)
									{
										updateframe.setVisible(false);
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
					}
					
					
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btnedit);
		
		jp.setVisible(true);
		jp2.setVisible(false);
		
		updateframe.add(jp);
		updateframe.add(jp2);
		
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
	}
	public void deletedata()
	{
		deleteframe = new JFrame();
		
		tf3 = new JTextField(15);
		btndelete = new JButton("Delete");
		
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String id = tf3.getText().toString();
				int id2 = Integer.parseInt(id);
				
				String db ="placement";
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "delete from info where id='"+id2+"'";
					
					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						deleteframe.setVisible(false);
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
		
		
		deleteframe.add(tf3);
		deleteframe.add(btndelete);
		
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
		
	}
}
