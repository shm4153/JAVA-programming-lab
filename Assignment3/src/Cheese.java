public class Cheese extends Food
{
//calculates the cheese added of option American cheese, swiss, cheddar to burger
	private int type;
	private int cost;
  
  
  //constructor of cheese class
	public Cheese(int type, int cost) 
	{
		super(type, cost);
	}
  
  
	public int getType() 
	{
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public void setCost(int cost) {
		  this.cost = cost;
	  }
  
	public int calculateCost(int type)
	{
		if(type == 1) {
			cost = 0;
		}
		if(type == 2) {
			cost = 0;
		}
		if(type == 3) {
			cost = 100;
		}
	    if(type == 4) {
	    	cost = 0;
	    }
	    return cost; 
	}


	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}


}