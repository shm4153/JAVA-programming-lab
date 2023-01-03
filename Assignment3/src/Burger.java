//subclass of super class Food 

public class Burger extends Food //inheritance
{
	private int type;
	private int cost; 
	private int[] ingredients;
	private int ingredientsCost;
	private int cheeseObject;

	//declares all the four prices for 4 available ingredients 


	public void setCheeseObject(int cheeseObject) {
		this.cheeseObject = cheeseObject;
	}
	
	
	public int cheeseObject(int type)
	{
		int costCheese=0;
		
		if(type == 1) {
			costCheese = 0;
		}
		if(type == 2) {
			costCheese = 0;  
		}
		if(type == 3) {
			costCheese = 100;
		}
	    if(type == 4) {
	    	costCheese = 0;
	    }
	    return costCheese; 
	}
	
	//getter of ingredientsCost
	public int getIngredientsCost() 
	{
		return ingredientsCost;
	}


	//constructor of burger class
	public Burger(int type, int cost)
	{
		super(type, cost);
	}
	
	//getter of burger type
	public int getType() {
		return type;
	}
	
	//setter of burger type
	public void setType(int type) {
		this.type = type;
	}
	
	
	//setter of ingredientsCost 
	public void costIngredients(int[] ing1, int index) {
		int ingredientsCost = 0;
		ingredientsCost += ing1[index];
		this.ingredientsCost = ingredientsCost;
		// TODO Auto-generated method stub
	}
	

  //getter. implemented version of calculateCost for burger with cheese and ingredients
	public int calculateCost(int type)
	{
		if(type == 1) {
			cost = 4000;
		}
		if(type == 2) {
			cost = 5000;
		}
		if(type == 3) {
			cost = 5000;
		}
	    if(type == 4) {
	    	cost = 5000;
	    }
	    if(type == 0) {
			cost = 0;
		}
	    int burgerCost= cost;
	    

		int total = burgerCost + ingredientsCost+ cheeseObject;
		// TODO Auto-generated method stub
		
	    return total;
	}
  
  //setter. Implemented version of calculateCost setter for burger
	 public void setCost(int cost)
	 {
	   this.cost = cost;
	    
	 }
	 
	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}


	//getter of ingredients
	public int[] getIngredients() {
		return ingredients;
	}


	//setter of ingredients
	public void setIngredients(int[] ingredients) {
		this.ingredients = ingredients;
	}





}