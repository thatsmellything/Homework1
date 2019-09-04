package controller;

import tests.*;
import model.*;

public class Controller 
{

	public void start()
	{
		tests.TestDate.start();
		
		
		try {
			tests.TestPerson.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
