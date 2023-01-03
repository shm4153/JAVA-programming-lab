package task2Assignment2;

public class Book
{
	//variables for book class
	private int bookID;
	private String bookTitle;
	private double rate = 0.0;
	private int reviewCount = 0;
	private int averageRate;

	//constructor for book 
	public Book(int bookID, String bookTitle, double rate, int reviewCount, int averageRate)
	{
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.rate = rate;
		this.reviewCount = reviewCount;
		this.averageRate = averageRate;
	}

	public Book(int bookID, String bookTitle, int reviewCount)
	{
		this(bookID, bookTitle, 5.00, reviewCount, 0);
	}

	// getter of rate 
	public double updateRate(double newRate) {
		this.setRate(newRate);
		return this.rate;
	}
	
	// getter of review 
	boolean result;
	public boolean updateReviewCount(int rate) 
	{
		if (rate >= 0.0 && rate <= 5.0)
		{
			reviewCount++;
			this.reviewCount = this.reviewCount+rate; // counts every review and adds when rate is added from 0 to 5 
		}
		return result;
	}
	
	//getter of book ID
	public int getBookID() {
		return bookID;
	}

	//setter of book ID
	public void setBookID(int bookID)
	{
		this.bookID = bookID;
	}


	//getter of book title
	public String getBookTitle()
	{
		return bookTitle;
	}

	//setter of book title
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate)
	{
		
		this.rate = rate;
	}

	public int getReviewCount()
	{
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		if (rate>= 0.0 && rate<= 5.0) {
			reviewCount++;
		}
		this.reviewCount = reviewCount;
		
	}

	public int getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(int averageRate) {
		double h = 0;
		averageRate = (int)(h+rate);
		this.averageRate = averageRate;
	}

		
}

class Rater extends Book{
	public Rater() {
		super(0,"",0.0,0,0);
	}
	
	
}
