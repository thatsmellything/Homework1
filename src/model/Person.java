package model;

public class Person 
{
	//variables and conditions that are needed to be a person
	
	private String name;
	private String address;
	private String phNumber;
	private String eMail;
	
	public Person()
	{
		name = "unknown";
		System.out.println("Person constructor name : " + name);
	}
	
	public Person(String N, String A, String P, String E)
	{
		name = N;
		address = A;
		phNumber = P;
		eMail = E;
	}
	
	public void setName(String N)
	{
		name = N;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String A)
	{
		address = A;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhNumber(String P)
	{
		phNumber = P;
	}
	
	public String getPhNumber()
	{
		return phNumber;
	}
	
	public void setEMail(String E)
	{
		eMail = E;
	}
	
	public String getEMail()
	{
		return eMail;
	}
	
}
	
	
