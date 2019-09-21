package com.collection.mapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapExample1 {
	
	public static void main(String args[]) 
	   { 
	       Map< String,Integer> hm =  
	                        new HashMap< String,Integer>(); 
	       hm.put("Wagholi", 412207); 
	       hm.put("Kalyaninagr", new Integer(411006)); 
	       hm.put("pimplesaudagar", new Integer(411007)); 
	       hm.put("hinjewadi", new Integer(401007)); 
	       hm.put("checknull", null);
	       hm.put("checknullRepeat", null);
	       hm.put(null, 12112);
	       hm.put(null, 34567); // this will override earlier one
	  //     hm.put("Wagholi", 212223); -- it will override earlier one
	  
	       // Returns Set view      
	       Set< Map.Entry< String,Integer> > st = hm.entrySet();   //Converting to Set so that we can traverse  
	  
	       for (Map.Entry< String,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 
	   } 

}
