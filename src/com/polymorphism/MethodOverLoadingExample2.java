package com.polymorphism;

public class MethodOverLoadingExample2 {
	
	void  add(int a, int b)
	{
		System.out.println(a+b);
				}  
	
	
	void add(double a, double b){
		System.out.println(a+b);
		}  
	
	
	
	public static void main(String args[])// Interview Purpose we can overload main method
	{
		 MethodOverLoadingExample2 ab = new MethodOverLoadingExample2();
		 ab.add(32, 34);
		 ab.add(21.2, 23);
		 ab.add(12.2, 43.21);
	}

}
