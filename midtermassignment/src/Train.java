
public class Train extends PublicTransport {
	Station trainstation = new Station();
	
	public Train() {
		super();
		super.setModel("KORAIL");
	}
	
	@Override
	//total train fare:
	// if station < 5: total fare = base fare
	// else: total fare = base fare + (number of stations - 5) * fare per station
	public void calculatePayment() {
		//if less than 5 stations, total fare = base fare
		if(getnStations() < 5) {
			super.setTotalFare(getBaseFare());
		}
		//else, total fare = base fare + (number of stations - 5) * fare per station
		else {
			double totalFare = getBaseFare();
			totalFare += (getnStations() - 5) * getFarePerStation();
			super.setTotalFare(totalFare);
		}
	}
	
	//getter method for farePerStation from Station class
	public double getFarePerStation() {
		return this.trainstation.farePerStation;
	}
		
	//setter method for farePerStation from Station class
	public void setFarePerStation(double farePerStation) {
		this.trainstation.farePerStation = farePerStation;
	}
	
	//getter method for nStations from Station class
	public int getnStations() {
		return this.trainstation.nStations;
	}
	
	//setter method for nStations from Station class
	public void setnStations(int nStations) {
		this.trainstation.nStations = nStations;
	}
}
