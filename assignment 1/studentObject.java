import java.util.Scanner;

public class studentObject
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in); 
  	System.out.println("Enter your name: ");
  	String studentName = scanner.nextLine();
  	    
  	System.out.println("Enter your date of birth: ");
  	int dateofBirth = scanner.nextInt();
  	    
  	System.out.println("Enter you cumulative GPA: ");
  	double gpa = scanner.nextDouble();
  	scanner.nextLine();

  	System.out.println("Enter your department: ");
    
  	String department = scanner.nextLine();
    scanner.close();

    
  	Student studentObject = new Student(studentName, dateofBirth, gpa, department);
  	System.out.println("=========================");
  	System.out.println("Student's name: " + studentObject.getStudentName());
  	System.out.println("Student's age: "+ studentObject.getAge());
  	System.out.println("Student's CGPA: "+ studentObject.getGpa());
  	System.out.println("Student's department: "+ studentObject.getDepartment());
  }
}
