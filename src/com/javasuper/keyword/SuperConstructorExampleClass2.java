package com.javasuper.keyword;

public class SuperConstructorExampleClass2 extends SuperConstructorExampleClass1 {
	
	SuperConstructorExampleClass2()
	{
		
		// super(); //-- this is optinal every time default constructor of parent class will also be called
		super(1);
		
		System.out.println("i am child class constructor");
	}
	
	
	public static void main(String args[])
	{
		SuperConstructorExampleClass2 ab = new SuperConstructorExampleClass2();
	}

}
