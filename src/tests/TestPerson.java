package tests;

import model.*;




public class TestPerson 
{
	
	
	public static void main(String[] args)
	{
		//First part of the inputs for the test should always be null because the class names
		// will be automatically labeled in the output
		
		Person a, b, c, d, e;
		a = new Person(null, "Harry", "London", 839.3495345, "TheBoiWhoLived@gmail.com");
			a.toString();
		b = new Employee(null,"Dobby", "Snape's Lair", 385.7489503, "DobbyBoi@yahoo.com", "Elf Slave", 0.001, "HireDate");
			b.toString();
		c = new Faculty(null,"Katniss", "District 12", 701.2534895, "BowSniper17@ILiveInAWasteland.com", "Rabit Hunter CEO", 12.00,"HireDate", "Free whenever Peta is around;)", "Victor");
			c.toString();
		d = new Staff(null,"Thomas", "The Maze", 1800.9999999, "RunningMan@gmail.com", "Head Runner", 1000.00,"HireDate", "Lead Runner");
			d.toString();
		e = new Student(null,"Jensen", "Logan Utah", 801.6417630, "jensen.judkins@aggiemail.usu.edu", "Freshman");
			e.toString();
			
		
	}
	
	
	
	
	
}	


/*
 * 
class test
	{
	Person[] humans;
	
	public TestPerson()
	{
		humans = new Person[1];
		humans[0] = new Employee("Billy", "California Drive", 385.6238462, "someoneEmail@gmall.com");
		
		//humans[2] = new Faculty("Faculty", "Logan", 239848.23, "FacultyEmail@gmail.com");
		
	}
	
	public void whoAreThesePeople()
	{
		for(Person p : humans)
			p.whoIsThis();
		
		for(Person p : humans)
			System.out.println(p.getName() + " " + p.getAddress() + " " + p.getPhNumber() + " " + p.getEMail());
	}
	
	//public static void main(String[] args)
	{
		TestPerson tp = new TestPerson();
		tp.whoAreThesePeople();
		
		
	}
	}
	*/
	


