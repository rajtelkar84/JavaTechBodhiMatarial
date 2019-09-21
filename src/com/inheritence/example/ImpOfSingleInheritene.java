package com.inheritence.example;

public class ImpOfSingleInheritene extends SingleInheitence {
	
	int bonus=10000; 
	
	public static void main(String args[]){  
		ImpOfSingleInheritene p=new ImpOfSingleInheritene(); 
		p.method1();
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
		}  

}
