package task2Assignment2;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
	    Book firstBook = new Book(2343, "Harry Potter", 0);
	    Book secondBook = new Book(4434, "Deep Learning", 0); 
	    
        while(true)
        {
            System.out.println("=============");
            System.out.println("Book 1:"+ firstBook.getBookTitle());
            System.out.println("Book ID: "+ firstBook.getBookID());
            System.out.println("Book rate: "+ firstBook.getRate());
            System.out.println("Number of reviews: "+ firstBook.getReviewCount());
            System.out.println("=============");
            System.out.println("Book 2: "+ secondBook.getBookTitle());
            System.out.println("Book ID: "+ secondBook.getBookID());
            System.out.println("Book rate: "+ secondBook.getRate());
            System.out.println("Number of reviews: "+ secondBook.getReviewCount());
            System.out.println("Please select book (order number): ");
            int number = scanner.nextInt();
            System.out.println("You selected Book: ");
            if (number == 1) {
                System.out.println(firstBook.getBookTitle());
            }
            if (number == 2) {
                System.out.println(secondBook.getBookTitle());
            }
            System.out.println("Please enter your rate: ");
            double rate = scanner.nextDouble();
            if(rate >= 5) {
                System.out.println("Rating should be less than 5.");
                System.out.println(); //to leave some space
                System.out.println();
                System.out.println();
                continue;
            }
            System.out.println("Would you like to rate more (1: yes, 0, no): ");
            int add = scanner.nextInt();
            if (add == 1) {
            	
                continue;
            }
            if(add == 0) {
                break;
            }
        }
	}
		
}