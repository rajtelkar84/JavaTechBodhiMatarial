package com.collection.ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample2 {
	
	public static void main(String args[]){  
		  ArrayList<Object> list=new ArrayList<Object>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  list.add(3);
		  list.add(true);
		  //Traversing list through Iterator  
		  Iterator<Object> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   
		   
		  }  
		  
		  System.out.println("Traversing list through List Iterator:");  
          //Here, element iterates in reverse order  
             ListIterator<Object> list1=list.listIterator(list.size());  
             while(list1.hasPrevious())  
             {  
                 Object str=list1.previous();  
                 System.out.println(str);  
             }  
	 }  

}
