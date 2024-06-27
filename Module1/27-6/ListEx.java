package com.a276;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	
	JList list;
	JFrame frame;
	DefaultListModel<String> l1 = new DefaultListModel<>();  
	public ListEx() 
	{
		frame = new JFrame();
		
		l1.addElement("Item1");  
		l1.addElement("Item2");  
		l1.addElement("Item3");  
		l1.addElement("Item4");  
	
		
		list = new JList<String>(l1);
		list.setBounds(100,100, 75,75);  
		
		 frame.add(list);  
		 frame.setSize(400,400);  
		 frame.setLayout(null);  
		 frame.setVisible(true);  
		
		
	}
	
	public static void main(String[] args) 
	{
		new ListEx();
	}
}
