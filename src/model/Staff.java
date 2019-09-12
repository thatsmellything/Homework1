package model;

public class Staff extends Employee
{
	//add title
	String title;
	
	
		
		
		
		//name = "grandchild";
		//address = "none I dont own house";
		//phNumber = 000.0000000;
		//eMail = "IgotNoEmail@silly.com";
		
		//System.out.println("this is in the grandchild class " + name);
	
	
	public Staff(String N, String A, double P, String E, String O, double S, String title)
	{
		super(N,A,P,E,O,S);
		this.setTitle(title);
		
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String toString()
	{
		String person = "Staff: " + this.getName() + ", " + this.getAddress() + ", " +  this.getPhNumber() + ", " +  this.getEMail() + ", " +   this.getOffice() + ", " +   this.getSalary() + ", " + this.getTitle();
		System.out.println(person);
		System.out.println();
		return person;
	}
	
	
	

}
