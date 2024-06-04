package com.a46;


class Color
{
	String color ="black";
}
class Color2 extends Color
{
	String color ="white";

	void show()
	{
		System.out.println(color);
		System.out.println(super.color);//parent class variable call
	}
}

public class superkeyword 
{
	public static void main(String[] args)
	{
		Color2 c = new Color2();
		c.show();
	}
}
