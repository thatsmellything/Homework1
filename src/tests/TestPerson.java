package tests;

import model.*;




public class TestPerson 
{
	Person[] humans;
	
	public TestPerson()
	{
		humans = new Person[2];
		humans[0] = new Employee("Billy", "California Drive", 385.6238462, "someoneEmail@gmall.com");
		humans[1] = new Staff("James", "UT", 834758.234, "Anotheremail@yahoo.com");
		
	}
	
	public void whoAreThesePeople()
	{
		for(Person p : humans)
			p.whoIsThis();
		
		for(Person p : humans)
			System.out.println(p.getName() + " " + p.getAddress() + " " + p.getPhNumber() + " " + p.getEMail());
	}
	
	public static void main(String[] args)
	{
		TestPerson tp = new TestPerson();
		tp.whoAreThesePeople();
	}
	{
		
	}
	
	

}
