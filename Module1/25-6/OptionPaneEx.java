package com.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx 
{
	JFrame frame;

	public OptionPaneEx() 
	{
		
		String data = JOptionPane.showInputDialog(frame,"Enter Your Name");
		System.out.println("Welcome: "+data);
		
	}
	public static void main(String[] args) 
	{
		new OptionPaneEx();
	}
}
