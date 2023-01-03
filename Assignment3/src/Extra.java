public class Extra extends Food
{

	@SuppressWarnings("unused")
	private int cost;

	//constructor
	public Extra(int type, int cost) {
		super(type, cost);
	}
	//calculates cost of extras added to order of menu
	
	
	public int calculateCost(int type)
	{
		if(type == 0) {
			cost = 0;
		}
		if(type == 1) 
		{
			cost = 1500;
		}
		if(type == 2) 
		{
			cost = 1100;
		}
		if(type == 3) 
		{
			cost = 900;
		}
		if(type == 4)
		{
			cost = 1200;
		}
		return cost; 
	}

	 public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	//implemented version of calculateCost setter for burger
	public void setCost(int cost){
		this.cost = cost;
	}
	
	
	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
