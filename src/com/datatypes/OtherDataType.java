package com.datatypes;

import java.util.Scanner;

public class OtherDataType {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a no");
		int abc = sc.nextInt();
		System.out.println(abc+12);
		
		char a = 'G';	
		int i=89;
		byte b = 4;
		// byte b1 = 7888888955;
		short s = 56;		
		double d = 4.355453532;		
	    float f = 4.7333434f;		
		System.out.println("char: " + a); 
		System.out.println("integer: " + i); 
		System.out.println("byte: " + b); 
		System.out.println("short: " + s); 
		System.out.println("float: " + f); 
		System.out.println("double: " + d); 


	}

}
