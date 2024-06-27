package com.a276;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutEx 
{
	
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public LayoutEx() 
	{
		frame = new JFrame();
		
		btn1 = new JButton("Submit1");
		btn2 = new JButton("Submit2");
		btn3 = new JButton("Submit3");
		btn4 = new JButton("Submit4");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new LayoutEx();
	}
}
