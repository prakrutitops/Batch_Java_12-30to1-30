package com.a46;

class A1
{
	void a()
	{
		System.out.println("A Called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("B Called");
	}
}
class C1 extends B1
{
	void c()
	{
		System.out.println("C Called");
	}
}
class D1 extends C1
{
	void d()
	{
		System.out.println("D Called");
	}
}


public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		D1 d = new D1();
		d.a();
		d.b();
		d.c();
		d.d();
		
	}
}
