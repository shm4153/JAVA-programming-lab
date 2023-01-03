//inheritance class of Food for ingredients
public class Ingredients extends Food
{

	//constructor for ingredients
	public Ingredients(int type, int cost) {
		super(type, cost);
		// TODO Auto-generated constructor stub
	}

  

	@Override
	//getter of calculatecost in which is empty 
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
 