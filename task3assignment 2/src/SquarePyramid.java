public class SquarePyramid extends Shape3D{
	//instance variables
	private double edge;
	private Square square = new Square(edge);
	
	// constructor of square pyramid
	public SquarePyramid(double edge) {
		this.edge = edge;
		square.setEdge(edge);
	}

	//getter of edge
	public double getEdge() {
		return edge;
	}
	
	//setter of edge
	public void setEdge(double edge) {
		this.edge = edge; 
	}
	
	//square getter
	public Square getSquare() {
		return square;
	}
	
	//square setter
	public void setSquare(Square square) {
		this.square = square;
	}
	
	//calculates square pyramid volume with square area
	public String calculateVolume(double edge, double height) {
		//square pyramid = square area * (height/3)
		double volume = square.calculateArea(edge)*height/3; //base area times height divided 3
		return String.format("%.2f\n", volume);
	}
}
