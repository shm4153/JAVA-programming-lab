import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		double salaryIncreasePercentage = 0;
		Scanner scanner = new Scanner(System.in);
		
		Employee firstEmployee = new Employee("John", 600000);
		Employee secondEmployee = new Employee("Mark", 900000);

		firstEmployee.getInformation();
		secondEmployee.getInformation();
			
		System.out.println("================");
		System.out.println("Increase salary (in percentage): ");
		salaryIncreasePercentage = scanner.nextDouble();
			
		firstEmployee.increaseSalary(salaryIncreasePercentage);
		secondEmployee.increaseSalary(salaryIncreasePercentage);
			
		System.out.println("After Salary Increase: ");
		firstEmployee.getInformation();
		secondEmployee.getInformation();
		scanner.close();	
	}
}