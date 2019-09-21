package com.stringExample;

public class StringMethod {
	
	public static void main(String args[])
	{
		String s1 = " My Name is Rajkumar  ";
		
		int stringlegth = s1.length();
		
		System.out.println(stringlegth);	
		
		
	int strlength =	s1.length();
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.substring(11));
		System.out.println(s1.substring(11,14));
		System.out.println(s1.contains("Raj"));
		System.out.println(s1.equals("Rajkumar"));
		String date = String.join(":","25","06","2018");   
		System.out.println(date);
		System.out.println(s1.indexOf("Raj"));
		System.out.println(s1.indexOf("a", 5));
		System.out.println(s1.lastIndexOf("a"));
		String[] s2 = s1.split(" ");
		
		System.out.println(s2[3]);
		
		System.out.println(String.join(":", s2[0],s2[1],s2[2],s2[3]));
		
		for(String s3 : s2)
		{
			System.out.println(s3);
		}
		
		System.out.println(s1.replace("Rajkumar", "Raj"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		
	}




}
