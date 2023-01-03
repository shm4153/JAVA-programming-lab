
// class for Taxi
// inheritance of Public Transport
public class Taxi extends PublicTransport {
	// newly required fields only for Taxi class
	private double farePerKM;
	private double distance;

	// base constructor
	public Taxi() {
		super();
		super.setModel("KAKAO TAXI");
	}

	@Override
	//total taxi fare = base fare + distance * farePerKM
	public void calculatePayment() {
		//temporary totalFare variable
		double totalFare = 0;
		//calculation
		totalFare = this.getBaseFare() + this.getDistance() * this.getFarePerKM();
		//call on setter for TotalFare from super
		super.setTotalFare(totalFare);
	}

	// getter method for farePerKM
	public double getFarePerKM() {
		return farePerKM;
	}

	// setter method for farePerKM
	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}

	// getter method for distance
	public double getDistance() {
		return distance;
	}

	// setter method for distance
	public void setDistance(double distance) {
		this.distance = distance;
	}

}
