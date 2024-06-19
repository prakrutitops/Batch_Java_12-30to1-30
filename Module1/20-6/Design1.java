package com.a206;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Design1 
{
	JFrame frame;
	JLabel lname;
	JButton btn;
	JTextField tf;
	
	public Design1() 
	{
		frame = new JFrame();
		
		lname = new JLabel("Welcome to tops");
		lname.setBounds(120, 11, 146, 14);
		
		btn = new JButton("Submit");
		btn.setBounds(135, 140, 75, 23);
		
		tf = new JTextField();
		tf.setBounds(120, 48, 108, 63);
		
		frame.add(lname);
		frame.add(btn);
		frame.add(tf);
		frame.setSize(350,350);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Design1();
	}
}
