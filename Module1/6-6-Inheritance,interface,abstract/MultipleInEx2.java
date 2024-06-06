package com.a66;

interface A1
{
	void a();
	
}
interface B1
{
	void b();
}

class C1 implements A1,B1
{

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}
	
}

public class MultipleInEx2
{
	public static void main(String[] args) {
		
		C1 c = new C1();
		c.a();
		c.b();
		
		
	}
}
