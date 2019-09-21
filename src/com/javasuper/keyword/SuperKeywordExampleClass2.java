package com.javasuper.keyword;

public class SuperKeywordExampleClass2 extends SuperKeywordExampleClass1 {
	
	String myname = "Rajkumar Telkar";
	
	void display()
	{
		System.out.println(myname);
		System.out.println(super.myname);	
		
	}
	
	public static void main(String args[])
	{
		SuperKeywordExampleClass2 ac = new SuperKeywordExampleClass2();
		ac.display();
	}

}
