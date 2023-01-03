package finalproject;

public class Sunny extends conditions{
	
	public Sunny() {
		super();
		super.setClimate("Sunny");
	}
	
	public void recommendOutfit() {
		String totalReminder = "put some suncreen too!";
		super.setTotalReminder(totalReminder);
	}
}
