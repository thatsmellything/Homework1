package model;

public class Person 
{
	//variables and conditions that are needed to be a person
	
	private String name;
	private String address;
	private double phNumber;
	private String eMail;
	
	
	
	public Person(String N, String A, double P, String E)
	{
		name = N;
		address = A;
		phNumber = P;
		eMail = E;
	}
	
	public void setName(String N){name = N;}
	
	public String getName(){return name;}
	
	public void setAddress(String A){address = A;}
	
	public String getAddress(){return address;}
	
	public void setPhNumber(double P){phNumber = P;}
	
	public double getPhNumber(){return phNumber;}
	
	public void setEMail(String E){eMail = E;}
	
	public String getEMail(){return eMail;}
	
	
	
	public static void main(String[] args)
	{
		Person a;
		a = new Person("james", "ksjhdf", 839.3495, "skdhf");
			a.toString();
		
	}

	
	
	public String toString()
	{
		String person = this.getName() + ", " + this.getAddress() + ", " +  this.getPhNumber() + ", " +  this.getEMail();
		System.out.println(person);
		return person;
		//children classes will use this
	}
	
}
	
	
