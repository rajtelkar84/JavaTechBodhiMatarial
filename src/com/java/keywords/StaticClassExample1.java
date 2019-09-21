package com.java.keywords;

public class StaticClassExample1 {
	
	private static String str = "Static class";

	   //Static class
	   static class MyNestedClass{
		//non-static method
		public void disp() {

		   /* If you make the str variable of outer class
		    * non-static then you will get compilation error
		    * because: a nested static class cannot access non-
		    * static members of the outer class.
		    */
		   System.out.println(str); 
		}
		
		public static void abc()
		{
			System.out.println("");
		}

	   }
	   public static void main(String args[])
	   {
	       /* To create instance of nested class we didn't need the outer
		* class instance but for a regular nested class you would need 
		* to create an instance of outer class first
	        */
		   
		   
		StaticClassExample1.MyNestedClass obj = new StaticClassExample1.MyNestedClass();
		obj.disp();
		
		StaticClassExample1.MyNestedClass.abc();
		
	   }
	}


