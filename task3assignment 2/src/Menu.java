
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== Welcome to TEACH MATH ===");
		System.out.println("1. Calculate volume of Square Pyramid.");
		System.out.println("2. Calculate volume of Cone.");
		System.out.println("3. Calculate volume of Cylinder,");
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			SquarePyramid p = new SquarePyramid(0.0);
			System.out.println("Enter edge of Square Pyramid: ");
			double edge = scanner.nextDouble();
			System.out.println("Enter height of Square Pyramid: ");
			double height = scanner.nextDouble();
			System.out.println("Volume of Square Pyramid: ");	
			System.out.println(p.calculateVolume(edge, height));
		}
		if (choice ==2 ) {
			Cone c = new Cone(0.0,0.0);
			
			System.out.println("Enter radius of Cone: ");
			double radius = scanner.nextDouble();
			c.setRadius(radius);
			System.out.println("Enter height of Cone: ");
			double height = scanner.nextDouble();
			c.setHeight(height);
			System.out.println("Volume of Cone: ");
			System.out.println(c.calculateVolume(radius, height));
		}
		if (choice == 3) {
			Cylinder cy = new Cylinder(0.0,0.0);
			System.out.println("Enter radius of cylinder: ");
			double radius = scanner.nextDouble();
			System.out.println("Enter height of cylinder: ");
			double height = scanner.nextDouble();
			System.out.println("Volume of cylinder: ");
			System.out.println(cy.calculateVolume(radius, height));
		}
		scanner.close();
		
	}

}
