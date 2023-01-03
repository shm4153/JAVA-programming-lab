public class Cone extends Shape3D
{
	//instance variable 
    private double height;
    private double radius;
    private Circle circle = new Circle(radius);

    //constructor 
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
        circle.setRadius(radius);
    }
	
    //getter of radius
	public double getRadius(){
		return radius;
	}
	
	//setter of radius
	public void setRadius(double radius) {
		this.radius = radius; 
		
	}
	
	//getter of height
	public double getHeight() {
		return height;
	}
	
	//setter of height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//brings circle
	public Circle getCircle() {
		return circle;
	}
	
	//setter of circle
	public void setCircle(Circle circle) {
		this.circle = circle; 
	}
	
	//calculates cone volume with circle area
	public String calculateVolume(double radius, double height) {
		double volume = circle.calculateArea(radius)*(height/3);
		return String.format("%.2f\n", volume);
	}

}