package com.java.keywords;

public class StaticMethodExample1 {
	
	 int rollno;  
     String name;  
     static String college = "OIST";  
     
     static void change(){  
         college = "LNCT";  
         }  

     
     public StaticMethodExample1(int r ,String s)
     {
    	 rollno =r;
    	 name = s;
     }
     
     void display()
     {
   //     college = "TIT";
    	 System.out.println(rollno+" "+name+" "+ college);
     }
     
     public static void main(String args[])
     {
    	 
    	 System.out.println();
    	 change();
    	 StaticMethodExample1 as = new StaticMethodExample1(325285,"Rajkumra");
    	 as.display();
     }
}
