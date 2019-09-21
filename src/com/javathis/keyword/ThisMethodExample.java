package com.javathis.keyword;

public class ThisMethodExample {
	
	void m()
	{
		System.out.println("hello m");
	}  
	
	void n(){  
	System.out.println("hello n");  
	m();
	//m();//same as this.m()  
//	this.m(); //this.m();
	}
	
	public static void main(String args[])
	{
		ThisMethodExample th = new ThisMethodExample();
		th.n();
				
	}

}
