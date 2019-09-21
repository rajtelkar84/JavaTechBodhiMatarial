package com.polymorphism;

public class MethodOverloadingExample1 {
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	

	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String args[])
	{
		MethodOverloadingExample1 ab = new MethodOverloadingExample1();
		
		MethodOverloadingExample1 abc = new MethodOverloadingExample1();
		
		ab.add(10, 20);
		ab.add(10, 20,30);
		
	}
	


}
