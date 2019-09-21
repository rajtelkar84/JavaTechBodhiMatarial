package com.interface1.example;

public class ImpOfJava8 implements Java8Interface1,Java8Interface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		Java8Interface2.super.method1();
		Java8Interface1.super.method1();
		
	}
	public static void main(String args[])
	{
		Java8Interface1 ab = new ImpOfJava8();
		Java8Interface2 ac = new ImpOfJava8();
		ImpOfJava8 ad = new ImpOfJava8();
		ad.method1();
		ab.method1();
		ac.method1();
		
		Java8Interface1.method2();
		Java8Interface2.method2();
	}



}
