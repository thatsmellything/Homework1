package controller;

import controller.Controller;
import model.*;


public class Runner 
{
	public static void main (String [] args)
	{
		Controller app = new Controller();
		Employee emp = new Employee();
		
		
		
		emp.returnEmpName();
		
		app.start();
	}

}
