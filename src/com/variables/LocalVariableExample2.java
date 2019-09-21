package com.variables;

public class LocalVariableExample2 {
	
	 private void StudentAge()  
	    {   //local variable age 
	         int age =0;
	  //      int age1; //-- we have to initialise variable before first use
	  //      age1 = age1+10;
	   //    static int b = 10; --- we can not use static in front of local variable
	   //     public int a=10; -- we can not use access modifier in front of local variable
	        age = age + 5; 
	        System.out.println("Student age is : " + age); 
	    } 
	 
	 void abc()
	 {
		 System.out.println("heeb");
	 }
	  
	    public static void main(String args[]) 
	    { 
	    	LocalVariableExample2 obj = new LocalVariableExample2(); 
	    	
	    	obj.abc();
	    	
	        obj.StudentAge(); 
	    } 

}
