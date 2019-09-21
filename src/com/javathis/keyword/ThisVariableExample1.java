package com.javathis.keyword;

public class ThisVariableExample1 {
	
	 int rollno;  
	String name;  
	float fee;  
	
	
	ThisVariableExample1(int rollno,String name,float fee){  
    this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
 
	
	public static void main(String args[]){  
		
		ThisVariableExample1 s1=new ThisVariableExample1(111,"ankit",5000);  
		ThisVariableExample1 s2=new ThisVariableExample1(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	} 
}
