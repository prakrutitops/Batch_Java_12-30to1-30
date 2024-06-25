package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboboxEx 
{
	JFrame frame;
	JComboBox<String> cb;
	String[] city = {"Rajkot","Ahmedabad","Baroda","Surat"};
	JButton btn;
	public ComboboxEx() 
	{
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(158, 45, 97, 23);
		
		btn = new JButton("Submit");
		btn.setBounds(268, 45, 97, 23);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String data = cb.getItemAt(cb.getSelectedIndex());
				System.out.println("Your Selected city is :"+data.toString());
				
			}
		});
		frame.add(cb);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ComboboxEx();
	}
}
