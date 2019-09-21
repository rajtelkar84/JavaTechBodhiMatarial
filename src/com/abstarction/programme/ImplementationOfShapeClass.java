package com.abstarction.programme;

public class ImplementationOfShapeClass extends AbstractClassShape {
	
	double radius;

	public ImplementationOfShapeClass(String color,double radius) {
		super(color);
		System.out.println("Implemeted child subclass functionality will be called");
		this.radius = radius;
		
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Circle color is " + super.color +  
                " and area is : " + area();
	}
	
	public static void main(String args[])
	{
		AbstractClassShape sh = new ImplementationOfShapeClass("Red",3);
		System.out.println(sh.toString());
		
	}
	
	

}
