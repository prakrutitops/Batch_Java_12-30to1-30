package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu File,Edit,Help;
	JMenuItem cut,copy,paste,selectall;
	JTextArea ta;
	
	public MenuEx() 
	{
		frame = new JFrame();
		
		menuBar = new JMenuBar();
		
		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Help = new JMenu("Help");
		
		ta = new JTextArea();
		
		
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectall = new JMenuItem("SelectAll");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
		Edit.add(cut);
		Edit.add(copy);
		Edit.add(paste);
		Edit.add(selectall);
	
		menuBar.add(File);
		menuBar.add(Edit);
		menuBar.add(Help);
		
		
		frame.setJMenuBar(menuBar);
		frame.add(ta);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		new MenuEx();
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
		
	}
}
