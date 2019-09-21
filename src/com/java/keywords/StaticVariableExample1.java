package com.java.keywords;

public class StaticVariableExample1 {
	
	 static int number=0;  
//	   int number1 =0;
	StaticVariableExample1(){  
	number++;  
	System.out.println(number);  
	//number1++;
//	System.out.println(number1);
	}  
	  
	public static void main(String args[]){  
	//creating objects  
		StaticVariableExample1 c1=new StaticVariableExample1();  
		StaticVariableExample1 c2=new StaticVariableExample1();  
		StaticVariableExample1 c3=new StaticVariableExample1();  
	}  
	}  


