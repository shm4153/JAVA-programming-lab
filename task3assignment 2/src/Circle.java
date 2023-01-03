public class Circle extends Shape2D
{
	//instance variable
	private double radius;
	
	// constructor of circle
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//setter of radius
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//getter of radius
	public double getRadius(){
		return radius;
	}
	
	//calculates area of circle
	public double calculateArea(double radius) {
		// area of circle = pi times radius^2
		return Math.PI*(radius*radius);
	}
}