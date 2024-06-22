package com.a226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorEx extends WindowAdapter implements ActionListener
{
	//declaration
	JFrame frame;
	JLabel label;
	JTextField tf1,tf2,tf3;
	JButton btnplus,btnminus,frame2btn;
	
	public CalculatorEx() 
	{
		//initialize
		
		frame = new JFrame();
		
		label =  new JLabel("Calculator");
		label.setBounds(200, 11, 86, 14);;
	
		tf1 = new JTextField();
		tf1.setBounds(180, 44, 86, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(180, 84, 86, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(180, 124, 86, 20);
		tf3.setEditable(false);
		
		btnplus = new JButton("+");
		btnplus.setBounds(167, 165, 55, 34);
		
		btnminus = new JButton("-");
		btnminus.setBounds(240, 165, 55, 34);
		
		frame2btn = new JButton("Switch to Other Screen");
		frame2btn.setBounds(164, 220, 170, 34);
		frame2btn.addActionListener(this);
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		frame.addWindowListener(this);
		
		
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(label);
		frame.add(btnplus);
		frame.add(btnminus);
		frame.add(frame2btn);
		frame.setSize(500,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CalculatorEx();
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		int ans = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit");
		
		if(ans == JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(ans == JOptionPane.NO_OPTION)
		{
			
		}
		if(ans == JOptionPane.CANCEL_OPTION)
		{
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
	
		int c = 0;
		
		if(e.getSource() == btnplus)
		{
			 c = Integer.parseInt(a) + Integer.parseInt(b);
		}
		if(e.getSource() == btnminus)
		{
			c = Integer.parseInt(a) - Integer.parseInt(b);
		}
		if(e.getSource() == frame2btn)
		{
			new SecondScreen();
		}
		
		tf3.setText(String.valueOf(c));
		
		
	}
}
