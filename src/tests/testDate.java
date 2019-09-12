package tests;

import controller.MyDate;

public class TestDate 
{
	static String hireDate;
	static String testDate;
	public static String start()
	{
		
	//getDate();
		
		
	MyDate date1 = new MyDate();
	//MyDate date2 = new MyDate(34355555133101L);
	
	hireDate = "Hire Date = Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear();
	//testDate = "tets date" + date2.getMonth() +""+ date2.getDay()+"" + date2.getYear();
	//System.out.println(testDate);
	
	return hireDate;
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