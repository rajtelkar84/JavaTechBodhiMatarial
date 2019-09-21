package com.javasuper.keyword;

public class SuperConstructorExampleClass1 {
	
	SuperConstructorExampleClass1()
	{
		this(1);
		System.out.println("i known as a parten cass constuctor");
	}
	
	SuperConstructorExampleClass1(int n)
	{
		System.out.println("i am parametrize constructor");
	}

}
