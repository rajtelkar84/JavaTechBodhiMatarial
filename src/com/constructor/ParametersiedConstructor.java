package com.constructor;

public class ParametersiedConstructor {
	
	 String name1;
    int id1;
 

    ParametersiedConstructor(String name, int id)
    {
        name1 = name;
        id1 = id;
    }
    
    ParametersiedConstructor()
    {
    	System.out.println("hello");
    }

    public static void main (String[] args)
    {

    	ParametersiedConstructor c1 = new ParametersiedConstructor("Rajkumar", 12345);
        System.out.println("Name :" + c1.name1 +
                           " and Id :" + c1.id1);
    }

}
