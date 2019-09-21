package com.constructor;

public class DefautConstructorExample2 {
	
	int id;  
	String name;  
	

	 
	void display(){System.out.println(id+"  "+name);}  
	  
	public static void main(String args[]){  
	//creating objects  
		DefautConstructorExample2 s1=new DefautConstructorExample2();  
		DefautConstructorExample2 s2=new DefautConstructorExample2();  
	 
	s1.display();  // this will print default value assigned by default constructor
	s2.display();  
	}  

}
