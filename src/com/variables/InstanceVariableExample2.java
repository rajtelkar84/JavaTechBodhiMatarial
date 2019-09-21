package com.variables;

public class InstanceVariableExample2 {
	
	 public String name;	   
	  private double salary;
	   
	   public void getname (String empName) {
	      name = empName;
	   }	  
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }	   
	   public void printEmp() {
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]) {
		   InstanceVariableExample2 empOne = new InstanceVariableExample2();
		   empOne.printEmp();
		   empOne.getname("Raj");
		   
	      empOne.setSalary(50000);
	      empOne.printEmp();
	      
	      empOne.getname("ADiti");
	      empOne.setSalary(40000);
	      
	      empOne.printEmp();
	      
	   }

}
