package com.collection.SetExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	
	 public static void main(String args[]){  
		 TreeSet<String> set=new TreeSet<String>();  
		         set.add("Raj");  
		         set.add("Anand");  
		         set.add("Ajay");  
		      //  set.add(null);
		         System.out.println("Traversing element through Iterator in descending order");  
		         Iterator i=set.descendingIterator();  
		         while(i.hasNext())  
		         {  
		             System.out.println(i.next());  
		         }  
		           
		 }  

}
