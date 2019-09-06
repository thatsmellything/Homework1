package model;

public class Student extends Person
{
	//school class freshman sophomore junior senior

	String classStatus = "Freshman";
	
	public Student()
	{
		super("Jensen", "8328 Mountain View Towers", 801.6417630, "jensen.judkins@aggiemail.usu.edu");
		
		
	}
	
	public Student(String N, String A, double P, String E)
	{
		super(N,A,P,E);
	}
	
	public static void main(String[] args)
	{
		Student St = new Student("Student", "Student Dorm", 801.6417630, "ComputerScienceStudent@aggiemail.usu.edu");
		System.out.println("Student Tester: " + St.getName() + ", " + St.getAddress() + ", " + St.getPhNumber() + ", " + St.getEMail() + ", " + St.classStatus);
	}
	
}
