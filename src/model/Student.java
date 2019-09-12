package model;

public class Student extends Person
{
	//school class freshman sophomore junior senior

	String classStatus;
	
	

	
	
	public Student(String C, String N, String A, double P, String E, String classStatus)
	{
		super(C,N,A,P,E);
		this.setClassStatus(classStatus);
	}
	
	public String getClassStatus() {
		return this.classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public void setClassName(String C)
	{
		C = className;
	}
	
	public String getClassName() 
	{
		className = "Student ";
		return className;
	}
	
	public String toString()
	{
		String person = this.getClassName() + "Name: " + this.getName() + ", Address: " + this.getAddress() + ", Phone Number: " +  this.getPhNumber() + ", eMail: " +  this.getEMail() + ", Class Status: " + this.getClassStatus();
		System.out.println(person);
		System.out.println();
		return person;
		//children classes will use this
	}
	
	
	
}
