package tests;

import model.*;




public class TestPerson 
{
	
	
	public static void main(String[] args)
	{
		Person.main(args);
		Student.main(args);
		Employee.main(args);
		Staff.main(args);
		
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
	


