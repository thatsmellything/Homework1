package model;

public class Faculty extends Employee 
{
	private String name;
	private String address;
	private String phNumber;
	private String eMail;
	
	public Faculty()
	{
		super();
		name = "billy";
		System.out.println("my name changed now to: " + name);
	
	}
	
	public String returnFacName()
	{
		return name;
	}
	
	public String returnFacAddress()
	{
		return address;
	}
	
	public String returnFacPhNumber()
	{
		return phNumber;
	}
	
	public String returnFacEMail()
	{
		return eMail;
	}

}
