package com.interface1.example;

public class ImpOfInterfaceExample1 implements IntefaceExample1 {

	@Override
	public void abc() {
		System.out.println("method abc");
		
	}
	
	public static void main(String args[])
	{
		IntefaceExample1 ab = new ImpOfInterfaceExample1();
		
		//a = 12; // Value of final value a can not be changed
		System.out.println(a);
		ab.abc();
	}
	
	

}
