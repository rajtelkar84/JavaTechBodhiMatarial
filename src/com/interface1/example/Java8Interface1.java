package com.interface1.example;

public interface Java8Interface1 {	
	
	default void method1() {
		
		System.out.println("This is a default method1 of class1");
	}
	
	static void method2()
	{
		System.out.println(" static method 2 in class 1");
	}

}
