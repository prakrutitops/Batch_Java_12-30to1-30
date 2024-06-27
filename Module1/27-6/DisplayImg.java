package com.a276;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class DisplayImg extends Canvas
{
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		  Toolkit t=Toolkit.getDefaultToolkit();  
	      Image i=t.getImage("D://photos//a.jpg");  
	      g.drawImage(i, 120,100,this);  
		
	}
	
	public static void main(String[] args) 
	{
		DisplayImg img = new DisplayImg();
		JFrame frame = new JFrame();
		frame.add(img);
		frame.setSize(400,400);  
		frame.setVisible(true);  
	}
}
