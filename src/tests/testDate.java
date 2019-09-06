package tests;

import controller.MyDate;

public class TestDate 
{
	String hireDate;
	
	public static void start()
	{
		
	//getDate();
		
		
	MyDate date1 = new MyDate();
	MyDate date2 = new MyDate(34355555133101L);
	
	String hireDate = "Date1 - Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear();
	
	System.out.println("Date1 - Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear());
	
	System.out.println("Date2 - Month: " + date2.getMonth() + " Day: " + date2.getDay() + " Year: " + date2.getYear());

	
	
	}
	/*
	public static String getDate()
	{
		MyDate date1 = new MyDate();
		String hireDate = "Date1 - Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear();
		return hireDate;
	}
	*/

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
}