
//class for Public Transport
//implementation of Payable
public abstract class PublicTransport implements Payable {
	// required field for PublicTransport
	private String model;
	private double baseFare;
	private double totalFare;

	// base constructor
	public PublicTransport() {
		setModel("");
		setBaseFare(0);
		setTotalFare(0);
	}

	@Override
	public void calculatePayment() {

	}

	// getter method for Model
	public String getModel() {
		return model;
	}

	// setter method for Model
	public void setModel(String model) {
		this.model = model;
	}

	// getter method for baseFare
	public double getBaseFare() {
		return baseFare;
	}

	// setter method for baseFare
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	// getter method for totalFare
	public double getTotalFare() {
		return totalFare;
	}

	// setter method for totalFare
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

}
