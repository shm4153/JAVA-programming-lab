package assignment1;

import java.util.Scanner;

// public class for task 1

public class Student
{
	private String studentName;
	private static int dateOfBirth;
	private double gpa;
	private String department;
	private int age;

	public Student(String n, int b, double g, String d) 
  {
		studentName  = n;
		dateOfBirth = b;
		gpa = g;
		department = d;
	}

	//saves the student name inside object
  public void studentName(String n){
    studentName = n;
  }
  
	public String getStudentName() 
	{
		return studentName;
	}

	//saves the date of birth inside object
  public void dateOfBirth(int b){
    dateOfBirth = b;
  }
	
  //does the math to find age 
	public int getAge() 
	{
		age = 2022 - dateOfBirth; 
		return age;
	}

	//saves the gpa of student object
  public void gpa(int g)
  {
    gpa = g;
  }
  
  //returns the student gpa
	public double getGpa() 
	{
		return gpa;
	}

	// saves the department of study to student
  public void department(String d){
    department = d; 
  }
  
  //returns the department of the student studying
	public String getDepartment()
	{
		return department;
	}
  
}