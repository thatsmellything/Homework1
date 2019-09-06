package controller;

import model.*;

public class Controller 
{

	Person[] people;
	
	public Controller()
	{
		people = new Person[5];
		people[0] = new Person("Random Guy", "Some address", 023.123, "emailtime");
	}
	
	public void start()
	{
		for(Person p : people)
			p.whoIsThis();
		
		for(Person p : people)
			System.out.println(p.getName() + ", " + p.getAddress() + ", " + p.getPhNumber() + ", " + p.getEMail());
		
		
		tests.TestDate.start();
		
		
		
	}

	
}
