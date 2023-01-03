package finalproject;

public class Snowy extends conditions{

	public Snowy(){
		super();
		super.setClimate("Snowy");
	}
	
	public void recommendOutfit() {
		String totalReminder = "have an umbrella in hand!\n";
		super.setTotalReminder(totalReminder);
	}

}