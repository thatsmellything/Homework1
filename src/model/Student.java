package model;

public class Student extends Person
{
	//school class freshman sophomore junior senior

	String classStatus;
	
	

	
	
	public Student(String N, String A, double P, String E, String classStatus)
	{
		super(N,A,P,E);
		this.setClassStatus(classStatus);
	}
	
	public String getClassStatus() {
		return this.classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public String toString()
	{
		String person = "Student: " + this.getName() + ", " + this.getAddress() + ", " +  this.getPhNumber() + ", " +  this.getEMail() + ", " + this.getClassStatus();
		System.out.println(person);
		System.out.println();
		return person;
		//children classes will use this
	}
	
	
	
}
