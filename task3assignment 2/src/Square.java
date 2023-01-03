public class Square extends Shape2D
{
	//instance variable
	private double edge;
	
	//constructor of square
	public Square(double edge) {
		this.edge = edge;
	}
	
	//setter of edge
	public void setEdge(double edge){
		this.edge = edge;
	}
	
	//getter of edge
	public double getEdge(){
		return edge;
	}
	
	//calculates area of square
	public double calculateArea(double edge){
		// area of a square = edge^2
		return edge*edge;
	}
	
}