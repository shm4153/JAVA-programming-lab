public class Cylinder extends Shape3D
{
	//instance variables
	private double height;
	private double radius;
	private Circle circle = new Circle(radius);
	
	//constructor 
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
		circle.setRadius(radius);
		
	}
	
	//setter of radius
	public void setRadius (double radius) {
		this.radius = radius; 
	}
	
	//getter of radius
	public double getRadius() {
		return radius;
	}
	
	//setter of height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter of height
	public double getHeight() {
		return height;
	}
	
	//getter of circle
	public Circle getCircle() {
		return circle;
	}
	
	//setter of circle
	public void setCircle(Circle circle) {
		this.circle = circle; 
	}
	
	// getter of cylinder volume
	public String calculateVolume(double radius, double height){
		double volume = (circle.calculateArea(radius)*height);
		return String.format("%.2f\n", volume);
	}

}