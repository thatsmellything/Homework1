package model;

public class Faculty extends Employee 
{
	//add office hours and a rank
	
	String officeHours = "9am-11:30am";
	String rank = "Grand Wizard";
	
	
	public Faculty(String N, String A, double P, String E, String O, double S)
	{
		super(N,A,P,E,O,S);
	}
	
	public String toString()
	{
		return null;
		
		//Faculty Fac = new Faculty("Faculty", "Faulty Work Address", 1800.20348720374, "Faculty@gmail.com");
		//String Facultytest = N + A;
		
		
	}
	
	public static void main(String[] args)
	{
		Faculty Fac = new Faculty("Faculty", "Faulty Work Address", 1800.20348720374, "Faculty@gmail.com", "CEO", 219021.21);
		System.out.println("Faculty Tester: " + Fac.getName() + ", " + Fac.getAddress() + ", " + Fac.getPhNumber() + ", " + Fac.getEMail() + ", " + Fac.officeHours + ", " + Fac.rank);
	}

}
