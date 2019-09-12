package model;

public class Person 
{
	//variables and conditions that are needed to be a person
	
	protected String name;
	protected String address;
	protected double phNumber;
	protected String eMail;
	
	public Person()
	{
		name = "unknown";
		System.out.println("Person constructor name : " + name);
	}
	
	public Person(String N, String A, double P, String E)
	{
		name = N;
		address = A;
		phNumber = P;
		eMail = E;
	}
	
	public void setName(String N){name = N;}
	
	public String getName(){return name;}
	
	public void setAddress(String A){address = A;}
	
	public String getAddress(){return address;}
	
	public void setPhNumber(double P){phNumber = P;}
	
	public double getPhNumber(){return phNumber;}
	
	public void setEMail(String E){eMail = E;}
	
	public String getEMail(){return eMail;}
	
	public void whoIsThis()
	{
		System.out.println("This method will be used in child class hopefully: ");
	}
	
	public static void main(String[] args)
	{
		Person tester = new Person("Person", "Person Home", 801.6363, "Person@email.com");
		System.out.println("Person Tester: " + tester.getName() + ", " + tester.getAddress() + ", " + tester.getPhNumber() + ", " + tester.getEMail());
		
	}

	public String whoIsThisAgain() 
	{
		Person Ben = new Person("Ben", "Ben House", 8234.2345435, "Ben@gmail.com");
		String benInfo = "Ben: " + Ben.getName() + ", " + Ben.getAddress() + ", " + Ben.getPhNumber() + ", " + Ben.getEMail();
		return benInfo;
	}
	
	public String toString()
	{
		return null;
		//children classes will use this
	}
	
}
	
	
