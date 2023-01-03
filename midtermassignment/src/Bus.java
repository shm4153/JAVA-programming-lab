
// class for Bus
// inheritance of PublicTransport class
public class Bus extends PublicTransport {
	Station busstation = new Station();
	
	public Bus() {
		super();
		super.setModel("KORBUS");
	}
	
	@Override
	//total bus fare:
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
		return this.busstation.farePerStation;
	}
	
	//setter method for farePerStation from Station class
	public void setFarePerStation(double farePerStation) {
		this.busstation.farePerStation = farePerStation;
	}
	
	//getter method for nStations from Station class
	public int getnStations() {
		return this.busstation.nStations;
	}
	
	//setter method for nStations from Station class
	public void setnStations(int nStations) {
		this.busstation.nStations = nStations;
	}
	
}
