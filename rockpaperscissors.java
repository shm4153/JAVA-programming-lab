package assignment1;

import java.util.Random;
import java.util.Scanner;

class rockpaperscissors
{
	/**
	 *  function evaluates win between rock paper scissor from computer and user
	 * @param playerChoice saves player choice for games
	 * @param computerChoice saves player choice for computer random 
	 * returns winner from computer and user after three games 
	 */
	
	  public static String evalWinner(String playerChoice, String computerChoice) {
	    if (playerChoice.equals(computerChoice)) {
	      return "Draw";
	    }
	    if ((playerChoice.equals("Scissors") && computerChoice.equals("Rock"))
	        || (playerChoice.equals("Paper") && computerChoice.equals("Scissors"))
	        || (playerChoice.equals("Rock") && computerChoice.equals("Paper"))) {
	      return "Computer";
	    } else {
	      return "Player";
	    }
	  }

	  public static void main(String[] args) {

	    int computerPoints = 0; //for counting computer wins
	    int playerPoints = 0; //for counting player wins 
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Let's play Kai-Bai-Bo(scissors, rock, paper)");

	    //prints options for rock paper scissors 
	    for (int i = 1; i <= 3; i++) {
	      // System printing
	      System.out.println("Round " + i);
	      System.out.println("Kai-Bai-Bo!");
	      System.out.println("1. Kai (scissors)");
	      System.out.println("2. Bai (rock)");
	      System.out.println("3. Bo (paper)");
	      System.out.print("Your choice: ");

	      int userC = scanner.nextInt();
	      String playerString;

	      // player choice
	      if (userC == 1) {
	        playerString = "Scissors";
	      } else if (userC == 2) {
	        playerString = "Rock";
	      } else {
	        playerString = "Paper";
	      }
	      System.out.println("You: " + playerString);

	      // computer choice
	      Random randomGenerator = new Random();
	      int computerC = randomGenerator.nextInt(3) + 1;
	      String computerString;
	      if (computerC == 1) {
	        computerString = "Scissors";
	      } else if (computerC == 2) {
	        computerString = "Rock";
	      } else {
	        computerString = "Paper";
	      }
	      System.out.println("Computer: " + computerString);

	      // evaluating winner
	      String winner = evalWinner(playerString, computerString);
	      if (winner == "Computer") {
	        computerPoints++;
	      } else if (winner == "Player") {
	        playerPoints++;
	      }
	      //prints winner for ro
	      System.out.println("Winner: " + winner);
	      System.out.println("========================");
	    }

	    // decide winner between user and computer playing rock paper scissor 
	    System.out.println("You " + playerPoints
	        + " : " + computerPoints
	        + " Computer");
	    if (computerPoints > playerPoints) { //loops to print final winner from points
	      System.out.println("Final Winner: Computer!");
	    } else if (playerPoints > computerPoints) {
	      System.out.println("Final Winner: You!");
	    } else {
	      //prints both win when both tie out(?)
	      System.out.println("Both Win!");
	    }
	  }
	}
