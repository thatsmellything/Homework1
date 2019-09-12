package tests;

import model.*;




public class TestPerson 
{
	
	
	public static void main(String[] args)
	{
		Person a, b, c, d, e;
		a = new Person("james", "ksjhdf", 839.3495, "skdhf");
			a.toString();
		b = new Employee("james", "ksjhdf", 839.3495, "skdhf", "CEO", 219021.21);
			a.toString();
		c = new Faculty("james", "ksjhdf", 839.3495, "skdhf", "CEO", 219021.21);
			b.toString();
		d = new Staff("james", "ksjhdf", 839.3495, "skdhf", "CEO", 219021.21, "Communications Cordinator");
			c.toString();
		e = new Student();
			d.toString();
			
		
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
	


