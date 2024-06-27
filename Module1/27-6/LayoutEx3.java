package com.a276;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutEx3 
{
	
	JFrame frame;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	
	public LayoutEx3() 
	{
		frame = new JFrame();
		
		btn1 = new JButton("East");
		btn2 = new JButton("West");
		btn3 = new JButton("North");
		btn4 = new JButton("South");
		btn5 = new JButton("Center");
	
		
		frame.add(btn1,BorderLayout.EAST);
		frame.add(btn2,BorderLayout.WEST);
		frame.add(btn3,BorderLayout.NORTH);
		frame.add(btn4,BorderLayout.SOUTH);
		frame.add(btn5,BorderLayout.CENTER);
		
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new LayoutEx3();
	}
}
