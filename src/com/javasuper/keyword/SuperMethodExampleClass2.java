package com.javasuper.keyword;

public class SuperMethodExampleClass2 extends SuperMethodExampleClass1{
	
	int n=20;
	
	
	void mymethod()
		{
			System.out.println("I am method of child class");	
		}
	
	void anothermethod()
	{
		System.out.println(super.n);
		System.out.println(n);
		super.mymethod();
		mymethod();
		
		
	}
	
	public static void main(String args[])
	{
		SuperMethodExampleClass2 ab = new SuperMethodExampleClass2();
		ab.anothermethod();
		
		
		
	}
	

}
