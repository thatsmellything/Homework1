package tests;

import model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestPerson 
{
	
	private Employee testEmployee;
	
	
	@Before
	public static void start() throws Exception
	{
		testEmployee = new Employee();
	}

}
