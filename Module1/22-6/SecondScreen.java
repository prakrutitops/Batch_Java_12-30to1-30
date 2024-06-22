package com.a226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class SecondScreen implements ActionListener
{
	JLabel l1,l2;
	JFrame frame;
	JTextArea ta;
	JButton btn;
	JPasswordField pass;
	
	public SecondScreen() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		ta = new JTextArea();
		ta.setBounds(121, 37, 186, 102);
		
		btn = new JButton("Count");
		btn.setBounds(166, 150, 89, 23);
		
		l1 = new JLabel("");
		l1.setBounds(57, 11, 80, 14);
		
		l2 = new JLabel("");
		l2.setBounds(272, 11, 146, 14);
		
		pass = new JPasswordField();
		pass.setBounds(166, 230, 89, 23);
		
		btn.addActionListener(this);
		
		frame.add(ta);
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.add(pass);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			String data = ta.getText().toString();
			String words[] = data.split("\\s");
			l1.setText("Words:"+words.length);
			l2.setText("Characters:"+data.length());
		}
	}
	
}
