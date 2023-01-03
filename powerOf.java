package assignment1;

import java.util.Random;
import java.util.Scanner;

public class powerOf
{
	/**
	 * calculates the power and base relations between two numbers
	 * which are base and guess numbers
	 * It receives the base number and power. Then gives out the exponent decided whether relation 
	 * is true or false. 
	 */
	public static void main(String[] args) 
	  {
	    Scanner scanner = new Scanner(System.in); 

	    //asks the user to enter a base number
	    System.out.println("Enter the number: ");
	    int x = scanner.nextInt();

	    //asks the user to guess a power of a base number
	    System.out.println("Enter your guessed power of above number: ");
	    int y = scanner.nextInt();

	    //returns if power is true or false for base
	    System.out.println("==================");
	    if(isPower(x,y)==true)
	    {
	      System.out.println("power = "+numPow(x,y)); 
	      System.out.println("Output: true");
	    }
	    else
	    {
	      System.out.println("Output: false");
	    }
	    
	  }

	  //checks if the power is part of entered base number 
	  public static boolean isPower(int base, int n)
	  {
	    if (n == base){
	      return true;
	    }
	  
	    if (base == 1){
	      return false;
	    }
	        
	    int temp = base;

	    while (temp <= n)
	    {
	      if (temp == n){
	        return true;
	      }
	      temp *= base;
	    }
	    return false;
	  } 

	  // returns the power that makes argument true for base number 
	  public static int numPow(int base, int argument)
	  {
	    int sum = (int) (Math.log(argument) / Math.log(base));

			return sum;			
	  }

	 
	}

}
