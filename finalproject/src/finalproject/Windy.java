package finalproject;


public class Windy extends conditions{
	conditions windy = new conditions();
	

	public Windy(){
		super();
		super.setClimate("Windy");
	}
	
	public void recommendOutfit() {
		String totalReminder = "Try staying at home!\n";
		super.setTotalReminder(totalReminder);
	}

}