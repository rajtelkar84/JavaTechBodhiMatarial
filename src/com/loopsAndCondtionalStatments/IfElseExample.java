package com.loopsAndCondtionalStatments;

import java.util.Scanner;

public class IfElseExample {
	
	
	void evenodd()
	{
	System.out.println("Please enter a no");
	Scanner sc = new Scanner(System.in); // scanner class is used in java to take run time value	
	int number = sc.nextInt();	
	
	//System.out.println(number);		
	  if(number%2==0){  
	        System.out.println("even number");  
	    }	  
	  else{  
	        System.out.println("odd number");  
	    }  
	}

public static void main(String args[])

{
	IfElseExample	ab = new IfElseExample();
	ab.evenodd();
}
}
