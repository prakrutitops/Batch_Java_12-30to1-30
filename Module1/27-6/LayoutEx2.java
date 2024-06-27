package com.a276;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutEx2 
{
	
	JFrame frame;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	
	public LayoutEx2() 
	{
		frame = new JFrame();
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		
		frame.setSize(300,300);
		frame.setLayout(new GridLayout(3,3));
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new LayoutEx2();
	}
}
