package com.variables;

public class InstanceVariableExample1 {
	
	String myInstanceVar="instance variable";
	
	   public static void main(String args[]){
		   InstanceVariableExample1 obj = new InstanceVariableExample1();
		   InstanceVariableExample1 obj2 = new InstanceVariableExample1();
		   InstanceVariableExample1 obj3 = new InstanceVariableExample1();
			
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

			
		obj2.myInstanceVar = "Changed Text";

			
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	   }
	}


