package assignment1;

import java.util.Scanner;

public class studentObject
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in); 
    //receives input information of student name 
  	System.out.println("Enter your name: ");
  	String studentName = scanner.nextLine();

  	// receives input information of student date of birth
  	System.out.println("Enter your date of birth: ");
  	int dateofBirth = scanner.nextInt();
  	
  	// receives input information of student gpa
  	System.out.println("Enter you cumulative GPA: ");
  	double gpa = scanner.nextDouble();
  	
  	// receives input information of student department 
  	System.out.println("Enter your department: ");
  	scanner.nextLine();
  	String department = scanner.nextLine();
    scanner.close();

    //prints out student information 
  	Student studentObject = new Student(studentName, dateofBirth, gpa, department);
  	System.out.println("=========================");
  	System.out.println("Student's name: " + studentObject.getStudentName());
  	System.out.println("Student's age: "+ studentObject.getAge());
  	System.out.println("Student's CGPA: "+ studentObject.getGpa());
  	System.out.println("Student's department: "+ studentObject.getDepartment());
  }
}
