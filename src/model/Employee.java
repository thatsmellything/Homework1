package model;

import tests.*;
import controller.*;

public class Employee extends Person
{

	//add office salary date hired
	
	String office = "CEO";
	double salary = 100000.99;
	String dateHired;
	/*
	public String getDate()
	{
		return null;
		dateHired = TestDate.getDate();
		
	}
	*/
	public Employee()
	{
		super("Joe", "2733 willow wick dr", 801.6417630, "email@email.com");
		
		System.out.println("Constructor for Employee is correct: " + name + ", " + address + ", " + phNumber + ", " + eMail);
	}
	
	public Employee(String N, String A, double P, String E)
	{
		super(N,A,P,E);
	}
	
	public static void main(String[] args)
	{
		Employee Em = new Employee("Employee", "Employee Work Address", 98238.237844, "Employee@email.com");
		System.out.println("Employee Tester: " + Em.getName() + ", " + Em.getAddress() + ", " + Em.getPhNumber() + ", " + Em.getEMail() + ", " + Em.office + ", " + Em.salary + ", " + Em.dateHired);
	}
}


