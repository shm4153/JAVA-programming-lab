package practice;

import java.util.Scanner;

public class rectangle 
{
	private double height;
	private double width;
	
	public rectangle() {
		height = 0.0;
		width = 0.0;
	}
	
	public rectangle(double height, double width) {
		//this.height = height;
		setHeight(height);// okay 
		//this.width = width;
		setWidth(width);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) 
	{
		if(height>=0.0 && height <= 20) 
		{
			this.height = height;
		}
	}
	
	public void setWidth(double width) 
	{
		if(width>=0.0 && width <= 20) 
		{
			this.width = width;
		}
	}
	
	
	public double area() 
	{
		//double areaCalc = getHeight()* getWidth();
		//double areaCalc = height*width;
		//return areaCalc; // change void to double as areaCalc is double
		return getHeight() * getWidth();
	}
	
	public double perimeter() 
	{
		// double perimeterCalc = 2*(getWidth()+getHeight());// option 1
		// perimeterCalc = 2*(width+height); // option 2

		// return perimeterCalc;
		return 2*(height*width);
		
	}
	
	public String toString() {
		String info = "The rectangle height = "+this.getHeight()+"\n"+"width = "+this.getWidth()+"\n"+"area = "+this.area()+"\n"+"perimeter = "+ this.perimeter()+"\n";
		return info;
		
	}
	
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   }
}