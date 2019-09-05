package model;

public class Employee extends Person
{

	//add office salary date hired
	
	public Employee()
	{
		super("joe", "2733 willow wick dr", 801.6417630, "email@email.com");
		
		System.out.println("Constructor for Employee is correct: " + name + ", " + address + ", " + phNumber + ", " + eMail);
	}
	
	public Employee(String N, String A, double P, String E)
	{
		super(N,A,P,E);
	}
	
	public void whoIsThis()
	{
		
	}
}
