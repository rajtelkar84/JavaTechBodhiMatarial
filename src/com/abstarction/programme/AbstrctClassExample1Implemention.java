package com.abstarction.programme;

public class AbstrctClassExample1Implemention extends AbstrctClassExample1 {

	
	   void abstrctmethod() {

     System.out.println("This is abstract method which is overridden in its implemeted class");
		
	}
	
	
	public static void main(String args[])
	{
		AbstrctClassExample1 ab = new AbstrctClassExample1Implemention();
	//	AbstrctClassExample1 ab = new AbstrctClassExample1(); - cant create the instance of abstract class
		ab.abstrctmethod();
		ab.nonabstarctmethod();
	}
	
	

}
