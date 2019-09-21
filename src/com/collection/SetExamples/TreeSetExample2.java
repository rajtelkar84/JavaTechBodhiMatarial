package com.collection.SetExamples;

import java.util.TreeSet;

public class TreeSetExample2 {
	
	 public static void main(String args[]){  
		 TreeSet<Integer> set=new TreeSet<Integer>();  
		         set.add(24);  
		         set.add(66);  
		         set.add(12);  
		         set.add(15);
		       //  set.add(null); - nulll not allow in Treeset it will give null pointer exception at run time
		         System.out.println(set);
		         System.out.println("Reverse Set: "+set.descendingSet()); 
		         System.out.println("lowest Value: "+set.pollFirst());  
		         System.out.println("Highest Value: "+set.pollLast());  
		         System.out.println("after poll first and poll last "+set); 
		 }  

}
