

public class Employee {
	  // instance variables for employee class
	  protected String name;
	  protected double salary;
	  protected double tax;
	  protected double insurance;

	  // set function for employee data initializing name and salary
	  public Employee(String name, double salary) {
	    this.name = name;
	    this.salary = salary;
	    this.tax = 0.088 * salary;
	    this.insurance = 0.065 * salary;
	  }

	  // constructor for employee class
	  public Employee() {
	    this("none", 0.0);
	  }

	  // set function for name
	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }

	  // set function for salary
	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  // get function for salary
	  public double getSalary() {
	    return salary;
	  }

	  // set function for tax
	  public void setTax(double tax) {
	    this.tax = tax;
	  }

	  // get function for tax
	  public double getTax() {
	    return tax;
	  }

	  // set function for insurance
	  public void setInsurance(double insurance) {
	    this.insurance = insurance;
	  }

	  // get function for insurance
	  public double getInsurance() {
	    return insurance;
	  }

	  public String toString() {
	    return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f", "Name: ", name, "Salary: ", salary, "Tax: ", tax, "Insurance: ",
	        insurance);
	  }

	  public void getInformation() {
		 System.out.println("=====================");
		 System.out.println("Employee Info ");
		 System.out.println("Name: " + this.name);
		 System.out.printf("Salary: %.1f\n", this.salary);
		 System.out.printf("Tax: %.1f\n", this.tax);
		 System.out.printf("Insurance: %.1f\n", this.insurance);
	  }

	  public void increaseSalary(double salaryIncreasePercentage) 
	  {
		  this.salary = salary * (1 + salaryIncreasePercentage/100);
		  this.tax = salary * 0.088;
		  this.insurance = 0.065 * salary;
	  }
}
