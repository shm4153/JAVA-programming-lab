import java.util.Random;
import java.util.Scanner;

/**asks user to play with computer rock paper 
 *scissors three times. returns information of winner
  */

class rockPaperScissors {
  //evaluates who is the winner for each round at rock paper scissors
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

    int computerPoints = 0;
    int playerPoints = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Let's play Kai-Bai-Bo(scissors, rock, paper)");

    for (int i = 1; i <= 3; i++) {
      // System printing which shows options to say 
      System.out.println("Round " + i);
      System.out.println("Kai-Bai-Bo!");
      System.out.println("1. Kai (scissors)");
      System.out.println("2. Bai (rock)");
      System.out.println("3. Bo (paper)");
      System.out.print("Your choice: ");

      int userC = scanner.nextInt();
      String playerString;

      // player choice is chosen 
      if (userC == 1) {
        playerString = "Scissors";
      } else if (userC == 2) {
        playerString = "Rock";
      } else {
        playerString = "Paper";
      }
      System.out.println("You: " + playerString);

      // computer choice is chosen by random generator 
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

      // evaluating winner of computer and player 
      String winner = evalWinner(playerString, computerString);
      if (winner == "Computer") {
        computerPoints++;
      } else if (winner == "Player") {
        playerPoints++;
      }
      System.out.println("Winner: " + winner);
      System.out.println("========================");
    }

    // decide winner 
    System.out.println("You " + playerPoints
        + " : " + computerPoints
        + " Computer");
    if (computerPoints > playerPoints) {
      System.out.println("Final Winner: Computer!");
    } else if (playerPoints > computerPoints) {
      System.out.println("Final Winner: You!");
    } else {
      // returns both win when both tie at game rounds 
      System.out.println("Both Win!");
    }
  }
}
