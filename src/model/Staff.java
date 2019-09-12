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
	
	
	public Staff(String C, String N, String A, double P, String E, String O, double S, String D, String title)
	{
		super(C,N,A,P,E,O,S,D);
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
	

	
	public void setClassName(String C)
	{
		C = className;
	}
	
	public String getClassName() 
	{
		className = "Staff ";
		return className;
	}
	
	public String toString()
	{
		String person = this.getClassName() + "Name: " +this.getName() + ", Address: " + this.getAddress() + ", Phone Number: " +  this.getPhNumber() + ", eMail: " +  this.getEMail() + ", Office: " +   this.getOffice() + ", Salary: " +   this.getSalary() + ", Date Hired: " + this.getDateHired() + ", Title: " + this.getTitle();
		System.out.println(person);
		System.out.println();
		return person;
	}
	
	
	

}
