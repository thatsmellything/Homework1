package model;

public class Faculty extends Employee 
{
	//add office hours and a rank
	
	String officeHours;
	String rank;
	
	
	public Faculty(String C, String N, String A, double P, String E, String O, double S, String D, String officeHours, String rank)
	{
		super(C,N,A,P,E,O,S,D);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}
	
	public String getOfficeHours()
	{
		return this.officeHours;
	}
	
	public void setOfficeHours(String officeHours)
	{
		this.officeHours = officeHours;
	}
	
	public String getRank()
	{
		return this.rank;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public void setClassName(String C)
	{
		C = className;
	}
	
	public String getClassName() 
	{
		className = "Faculty: ";
		return className;
	}
	
	public String toString()
	{
		String person = this.getClassName() + this.getName() + ", " + this.getAddress() + ", " +  this.getPhNumber() + ", " +  this.getEMail() + ", " +   this.getOffice() + ", " +  this.getSalary() + ", " + this.getDateHired() + ", " +  this.getOfficeHours() + ", " +  this.getRank();
		System.out.println(person);
		System.out.println();
		return person;
		
		
	}
	
	

}
