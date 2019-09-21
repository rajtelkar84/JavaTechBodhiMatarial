package com.javathis.keyword;

public class ThisConstructorExample {
	
	ThisConstructorExample()
	{
		this(10);
		System.out.println("hello a");
		}  
	ThisConstructorExample(int x){  
	  
	System.out.println(x);  
	}  
	 
	public static void main(String args[])
	{  
		ThisConstructorExample a=new ThisConstructorExample();  
	}
	}  


