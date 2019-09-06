package model;

public class Faculty extends Employee 
{
	//add office hours and a rank
	
	String officeHours = "9am-11:30am";
	String rank = "Grand Wizard";
	
	Faculty()
	{
		super();
		
	}
	
	public Faculty(String N, String A, double P, String E)
	{
		super(N,A,P,E);
	}
	
	public static void main(String[] args)
	{
		Faculty Fac = new Faculty("Faculty", "Faulty Work Address", 1800.20348720374, "Faculty@gmail.com");
		System.out.println("Faculty Tester: " + Fac.getName() + ", " + Fac.getAddress() + ", " + Fac.getPhNumber() + ", " + Fac.getEMail() + ", " + Fac.officeHours + ", " + Fac.rank);
	}

}
