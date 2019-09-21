package com.java.keywords;

public class StaticClassExample2 {
	
	static int data=30; 
	
	
	  static class Inner{  
		  
	   static void msg()
	   {
		   System.out.println("data is "+data);
	   }  
	                     }  
	  
	  class InnerNonStatic
	  {
		   void disp()
		  {
			  System.out.println("i am method inside non static class");
		  }
	  }
	  public static void main(String args[]){  
	 StaticClassExample2.Inner.msg();//no need to create the instance of static nested class 
	 
 StaticClassExample2 outer = new StaticClassExample2();
 StaticClassExample2.InnerNonStatic inner = outer.new InnerNonStatic();
	 inner.disp();
	  }  
	}  


