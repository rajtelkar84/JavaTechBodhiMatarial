package com.collection.SetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetExample1 {
	
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Rajkumar");  
		  set.add("Raj");  
		  set.add("Rajkumar");  
		  set.add("Anand");  
		  set.add("Ram");
		  set.add(null);
		  set.add(null);
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
