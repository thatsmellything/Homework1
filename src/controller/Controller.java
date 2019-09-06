package controller;

import model.*;

public class Controller 
{

	Person[] people;
	
	public Controller()
	{
		people = new Person[5];
		people[0] = new Person("Random Guy", "Some address", 023.123, "emailtime");
		people[1] = new Employee("Employee", "Employee house", 2384.32, "j");
		people[2] = new Staff("Staff", "Staff house", 2384.32, "j");
		people[3] = new Faculty("Fac", "Fac house", 2384.32, "j");
		people[4] = new Student("Student", "Dorm", 2384.32, "j");
		
	}
	
	public void whoIsThis()
	{
		for(Person p : people)
			p.whoIsThisAgain();
		
		for(Person p : people)
			System.out.println(p.getName() + ", " + p.getAddress() + ", " + p.getPhNumber() + ", " + p.getEMail());
		
		
		
	}
	

	
}
