package model;

public class Employee extends Person
{
	
	
	
	
	
	public Employee()
	{
		super("joe", "2733 willow wick dr", 801.6417630, "email@email.com");
		
		System.out.println("constructor for employee is correct : " + name);
	}
	
	public Employee(String N, String A, double P, String E)
	{
		super(N,A,P,E);
	}
}
