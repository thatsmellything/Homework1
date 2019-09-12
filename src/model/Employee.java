package model;

import tests.TestDate;

public class Employee extends Person
{

	//add office salary date hired
	
	String office = "Employee";
	double salary = 100000.99;
	//String dateHired = TestDate.getHireDate();
	String dateHired;
	
	private String name;
	private String address;
	private double phNumber;
	private String eMail;
	
	
	
	
	public Employee(String N, String A, double P, String E, String office, double salary)
	{
		super(N,A,P,E);
		N = name;
		A = address;
		P = phNumber;
		E = eMail;
		this.setOffice(office);
		this.setSalary(salary);
	}
	
	

	
	public String toString()
	{
		String person = this.getName() + ", " + this.getAddress() + ", " +  this.getPhNumber() + ", " +  this.getEMail() + ", " +   this.getOffice() + ", " +   this.getSalary();
		System.out.println(person);
		return person;
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

	public static void main(String[] args)
	{
		Person a;
		a = new Employee("james", "ksjhdf", 839.3495, "skdhf", "CEO", 219021.21);
			a.toString();
	}
}


