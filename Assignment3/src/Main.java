import java.util.Scanner;
import java.util.ArrayList;


public class Main 
{
	public static void main(String[] args) 
	{
			try (Scanner order = new Scanner(System.in)) {
				//saves options of user order
				ArrayList<Integer> inputs = new ArrayList<>(); // has in track of all chosen orders prices except ingredients
				
				//Payment payment = new Payment(); // creates a payment object.
				//Food food = new Food(" ", 0);
				while(true)
				{
					
					System.out.println("Welcome to SKKU-SUBWAY!");
					System.out.println("Choose burgers (sandwiches): ");
					System.out.println("1. Egg Mayo - 4,000 won");
					System.out.println("2. Chicken Tikka - 5,000 won");
					System.out.println("3. Chicken Ham - 5,500 won");
					System.out.println("4. Roasted Chicken - 5,000 won");
					System.out.println("0. Cancel Order");
					System.out.println("Select Burger (1-5): ");
					Burger b = new Burger(0, 0);
					int burger = order.nextInt();
					if(burger == 0) {
						break;
					}
					b.setType(burger);
				    inputs.add(b.calculateCost(burger)); // adds burger price within input. tracks prices of order 
					System.out.println("===========================");
					System.out.println("1. American Cheese - (+0 won)");
					System.out.println("2. Swiss - (+100 won)");
					System.out.println("3. Cheddar - (+0 won)");
					System.out.println("Select Cheese (1-3): ");
					Cheese c = new Cheese(0, 0);
					int cheese = order.nextInt();
					c.setType(cheese);
				    inputs.add(b.cheeseObject(cheese));
				    
				    // i don't know how to make array of ingredients 
				    int ing1[] = new int[10]; // array maximum of 10 elements. has in track of all chosen ingredients since this one is unlimited
				    int index = 0;
				    System.out.println("===========================");
					System.out.println("1. Lettuce - (+0 won)");
					System.out.println("2. Tomatoes - (+0 won)");
					System.out.println("3. Cucumbers - (50 won)");
					System.out.println("4. Olives - (50 won)");
					System.out.println("0. Skip");
					System.out.println("Select Ingredients (1-4): ");
				    int ingredients = order.nextInt();
				    b.costIngredients(ing1, index);
				    
					while (ingredients != 0) 
					{
						index++;
						System.out.println("===========================");
						System.out.println("1. Lettuce - (+0 won)");
						System.out.println("2. Tomatoes - (+0 won)");
						System.out.println("3. Cucumbers - (50 won)");
						System.out.println("4. Olives - (50 won)");
						System.out.println("0. Skip");
						System.out.println("Select Ingredients (1-4): ");
						ingredients = order.nextInt(); 
						b.costIngredients(ing1, index);
						
						for(int a= 0; a < ing1.length; a++)
						{
							if(ingredients == 1) { //lettuce
					    		int ingredientPrice1 = 0;
					    		ing1[a]=ingredientPrice1;	// add new ingredients to array ing1
					    		continue;
							}
					    	if(ingredients == 2) { //tomatoes
					    		int ingredientPrice2 = 0;
					    		ing1[a]=ingredientPrice2;
					    		continue;
					    	}
					    	if(ingredients == 3) {
					    		int ingredientPrice3 = 50;
					    		ing1[a]=ingredientPrice3;
					    		continue;
					    	}
					    	if(ingredients == 4) {
					    		int ingredientPrice4 = 50;
					    		ing1[a]=ingredientPrice4;
					    		continue;
					    	}
						}
						
				    	b.costIngredients(ing1, index); //calculates ingredients price in burger class 
						

					} 

					System.out.println("===========================");
				  	System.out.println("1. Cola - 1,100 won");
				  	System.out.println("2. Fanta - 1,100 won");
				  	System.out.println("3 Chilsung Cider - 900 won");
				  	System.out.println("4. Zero Cola - 1,200 won");
				  	System.out.println("5. Coffee - 2,000 won");
				  	System.out.println("0. Skip");
				  	System.out.println("Select Beverage (1-5): ");
				  	int beverage = order.nextInt();
				  	Beverage bev = new Beverage(0,0);
				  	inputs.add(bev.calculateCost(beverage));
				  	
				  	int ice = 0;
				  	if( beverage != 0)
				  	{
				  		System.out.println("===========================");
					  	System.out.println("With ice? (0 [no] or 1[yes]: ");
					  	ice = order.nextInt(); 
					  	bev.setIce(ice);
				  	}
				  	
				  	
				  	System.out.println("===========================");
				  	System.out.println("Select Extras: ");
				  	System.out.println("1. Cookies - 1,500 won");
				  	System.out.println("2. French Fries - 1,000 won");
				  	System.out.println("3. Chips - 1,700 won");
				  	System.out.println("0. Skip");
				  	System.out.println("Select Extras (1-3): ");
				  	System.out.println("===========================");
				  	int extras = order.nextInt();
				  	Extra e = new Extra(0,0);
				  	inputs.add(e.calculateCost(extras));
				  	
				  	System.out.println("=========================");	    
				  	if(burger<=5 || burger >= 1)
				  	{
				  		if(ice== 0) 
				  		{
				  			System.out.println("|Burger (with cheese and ingredients): "+ b.calculateCost(burger));
					  		System.out.println("|Beverage (without ice): "+ bev.calculateCost(beverage));
				  		}
				  		if(ice == 1) 
				  		{
				  			System.out.println("|Burger (with cheese and ingredients): "+ b.calculateCost(burger));
					  		System.out.println("|Beverage (with ice): "+bev.calculateCost(beverage));
				  		}
				  		if(extras != 0) 
				  		{
					  		System.out.println("|Extra: "+e.calculateCost(extras));
					  	}
				  	}
				  	
				  	int totalPrice = b.calculateCost(burger) + bev.calculateCost(beverage) + e.calculateCost(extras);
				  	System.out.println("|TOTAL: "+ totalPrice);
				  	break;
				}
			}
		
			
			
			
	}
}




	