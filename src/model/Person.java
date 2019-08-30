package model;

public abstract class Person 
{
	//variables and conditions that are needed to be a person
	
	private String name;
	private String address;
	private String phNumber;
	private String eMail;
	
	public Person()
	{
		
	}
	
	public Person(String name, String address, String phNumber, String eMail)
	{
		this.name = name;
		this.address = address;
		this.phNumber = phNumber;
		this.eMail = eMail;
	}
	
	
	//setters and getters
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPhNumber()
	{
		return phNumber;
	}
	
	public void setPhNumber(String phNumber)
	{
		this.phNumber = phNumber;
	}
	
	public String getEmail()
	{
		return eMail;
	}
	
	public void setEmail(String eMail)
	{
		this.eMail = eMail;
	}
	
	
	@Override
	
	public String toString()
	{
		return getClass().getName() + "\n" + name;
	}

}
