package model;

public class Employee extends Person
{
	private String name;
	private String address;
	private String phNumber;
	private String eMail;
	
	
	
	
	public Employee()
	{
		name = "joe";
		
		System.out.println("constructor for employee is correct : " + name);
	}
	
	public String returnEmpName()
	{
		return name;
	}
	
	public String returnAddress()
	{
		return address;
	}
	
	public String returnEmpPhNumber()
	{
		return phNumber;
	}
	
	public String returnEmpEMail()
	{
		return eMail;
	}
}
