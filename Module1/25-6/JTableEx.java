package com.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx 
{
	JFrame f;
	 
	String data[][]=
				{ 
						{"101","Amit","670000"},    
						{"102","Jai","780000"},    
						{"101","Sachin","700000"}
				};    
	 
	 String column[]={"ID","NAME","SALARY"};         
	public JTableEx() 
	{
		// TODO Auto-generated constructor stub
		f = new JFrame();
		
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		
		JScrollPane sp = new JScrollPane(jt);
		
		f.add(sp);
		f.setSize(400,400);
		//f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		
		new JTableEx();
	}
}
