package com.java.keywords;

public  class StaticBlockExample1 {
	   static int num;
	   static String mystr;
	   
	   int m;
	   static{
		   
		   int n=10;
		   
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	   public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
	}