
public class Student {
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

  public void studentName(String n){
    studentName = n;
  }
  
	public String getStudentName() 
	{
		return studentName;
	}

  public void dateOfBirth(int b){
    dateOfBirth = b;
  }
	
	public int getAge() 
	{
		age = 2022 - dateOfBirth; 
		return age;
	}

  public void gpa(int g)
  {
    gpa = g;
  }
  
	public double getGpa() 
	{
		return gpa;
	}

  public void department(String d){
    department = d; 
  }
  
	public String getDepartment()
	{
		return department;
	}
  
}