public class Beverage extends Food
{
	private int type;
	private boolean ice;
	private int cost;
	//constructor of Beverage class
	  public Beverage(int type, int cost)
	  {
		  super(type, cost);
	  }
	  
	  
	  public int getType() 
	  {
		  return type;
	  }



	  public void setType(int type)
	  {
		  this.type = type;
	  }



	//setter of ice option
	  public void setIce(int n) {
		  if(n == 1) {
			  ice = true;
		  }
		  if (n == 0) {
			  ice = false;
		  }
	  }
	 
	  //getter of ice
	  public boolean getIce(int n) {
		  if( n == 1) {
			  ice = true;
		  }
		  if(n == 0) {
			  ice = false;
		  }
		  return ice;
	  }
	  
	   //setter. cost of beverage chosen with order
		public void setCost(int cost){
			this.cost = cost;
		}
		
	  //getter. implemented version of calculateCost getter for burger
	  public int calculateCost(int type)
	  {
		  if(type == 0) {
			  cost = 0; 
		  }
		  if(type == 1) 
		  {
			  cost = 1100;
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
		  if(type == 5) {
			  cost = 2000;
		  }
		  int beverageCost = cost;
		  
		  return beverageCost;
			
	  }


	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}


}