package com.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CafeOrderingSYstem extends WindowAdapter
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	
	
	public CafeOrderingSYstem() 
	{
		frame =  new JFrame();
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(182, 15, 146, 14);
		
		chk1 = new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(158, 55, 197, 23);
		
		chk2 = new JCheckBox("Burger @ Rs.70");
		chk2.setBounds(158, 85, 197, 23);
		
		chk3 = new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(158, 115, 197, 23);
		
		btnorder = new JButton("Order");
		btnorder.setBounds(158, 155, 97, 23);
		
		frame.addWindowListener(this);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				int amount = 0;
				StringBuilder builder = new StringBuilder("\n Selected Items");
				
				if(chk1.isSelected())
				{
					builder.append("\n Pizza -> Rs.100");
					amount+=100;
				}
				if(chk2.isSelected())
				{
					builder.append("\n Burger -> Rs.70");
					amount+=70;
				}
				if(chk3.isSelected())
				{
					builder.append("\n Coffee -> Rs.120");
					amount+=120;
				}
				
				builder.append("\n Total: "+amount);
				JOptionPane.showMessageDialog(frame, builder.toString());
			}
		});
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		int a = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			
		}
		if(a==JOptionPane.CANCEL_OPTION)
		{
			
		}
	}
	public static void main(String[] args)
	{
		new CafeOrderingSYstem();
	}
}
