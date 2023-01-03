
public class TwoDShape {
	private String Name;
	private String Color;
	private double dim1;
	private double dim2;

	public TwoDShape(String name, String color, double dim1, double dim2) {
		super();
		Name = name;
		Color = color;
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getDim1() {
		return dim1;
	}
	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}
	public double getDim2() {
		return dim2;
	}
	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
	
}

class Circle extends TwoDShape{
	
	public Circle(String name, String color, double rad) {
		super(name,color,rad,rad);
	} 
	public double getArea() {
		return Math.PI*getDim1()*getDim1();
	}
}
//subclass
class TestShape
{
	public static void main(String[] args) 
	{
		Circle object = new Circle("Circle","Red",5);
		System.out.println(object.getName());
		System.out.println(object.getColor());
		System.out.println(object.getArea());
		
	}
}