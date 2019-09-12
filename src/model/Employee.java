package model;

import tests.TestDate;

public class Employee extends Person
{

	//add office salary date hired
	
	String office;
	double salary;
	String dateHired;
	//String dateHired = TestDate.getHireDate();
	
	
	private String name;
	private String address;
	private double phNumber;
	private String eMail;
	
	
	
	
	
	public Employee(String C, String N, String A, double P, String E, String office, double salary, String dateHired)
	{
		super(C,N,A,P,E);
		N = name;
		A = address;
		P = phNumber;
		E = eMail;
		this.setOffice(office);
		this.setSalary(salary);
		this.setDateHired(dateHired);
	}
	
	
	public String getDateHired()
	{
		return this.dateHired;
	}
	
	public void setDateHired(String dateHired)
	{
		dateHired = TestDate.start();
		
		this.dateHired = dateHired;
	}
	
	
	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setClassName(String C)
	{
		C = className;
	}
	
	public String getClassName() 
	{
		className = "Employee ";
		return className;
	}

	public String toString()
	{
		
		String person = this.getClassName() + "Name: " +this.getName() + ", Address: " + this.getAddress() + ", Phone Number: " +  this.getPhNumber() + ", eMail: " +  this.getEMail() + ", Office: " +   this.getOffice() + ", Salary: " +   this.getSalary() + ", Date Hired: " + this.getDateHired();
		System.out.println(person);
		System.out.println();
		return person;
	}
	
	
}


