package model;

public class Person 
{
	//variables and conditions that are needed to be a person
	private String name;
	private String address;
	private double phNumber;
	private String eMail;
	String className;
	
	
	public Person(String C, String N, String A, double P, String E)
	{
		className = C;
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
	
	public void setClassName(String C)
	{
		C = className;
	}
	
	public String getClassName() 
	{
		className = "Person ";
		return className;
	}
	
	
	
	

	
	
	public String toString()
	{
		String person = this.getClassName() +  "Name: " + this.getName() + ", Address: " + this.getAddress() + ", Phone Number: " +  this.getPhNumber() + ", eMail: " +  this.getEMail();
		System.out.println(person);
		System.out.println();
		return person;
		//children classes will use this
	}
	
}
	
	
