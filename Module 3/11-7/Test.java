import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test implements ActionListener
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public Test() 
	{
		frame = new JFrame();
		
		btn1 = new JButton("INSERT");
		btn2 = new JButton("VIEW");
		btn3 = new JButton("UPDATE");
		btn4 = new JButton("DELETE");
		
		btn1.addActionListener(this);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		AllOperations a = new AllOperations();
		
		if(e.getSource()==btn1)
		{
			a.insertdata();
		}
	}
}
