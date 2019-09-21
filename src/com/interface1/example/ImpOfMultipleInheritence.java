package com.interface1.example;

public class ImpOfMultipleInheritence implements MultiInheitence1,MultipleInheitence2 {
	
	// void method1 -- implemented method in subclass inteface method must be public
	public void method1()
	{
		System.out.println("method 1 implementation");
	}
	
	public static void main(String args[])
	{
		MultiInheitence1 ab = new ImpOfMultipleInheritence();
		ab.method1();
		// System.out.println(x);
		System.out.println(MultiInheitence1.x);
		System.out.println(MultipleInheitence2.x);
	}

}
