package finalproject;


public abstract class conditions implements recommendation{
	private String climate;
	private String totalReminder;
	
	public conditions() {
		setClimate("");
		setTotalReminder("");
	}
	
	@override
	public void recommendOutfit() {
		
	}
	
	public String getClimate() {
		return climate;
	}
	
	public void setClimate(String climate) {
		this.climate = climate;
	}
	
	public String getTotalReminder() {
		return totalReminder;
	}
	
	public void setTotalReminder(String totalReminder) {
		this.totalReminder = totalReminder;
	}

	

	
}
