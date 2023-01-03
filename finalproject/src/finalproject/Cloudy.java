package finalproject;

public class Cloudy extends conditions{
	conditions cloudy = new conditions();
	

	public Cloudy(){
		super();
		super.setClimate("cloudy");
	}
	
	public void recommendOutfit() {
		String totalReminder = "have an umbrella in hand!\n";
		super.setTotalReminder(totalReminder);
	}

}