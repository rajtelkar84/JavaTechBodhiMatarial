package com.abstarction.programme;

public abstract class AbstractClassShape {
	
	String color; 
    
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public AbstractClassShape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 

}
    
}

