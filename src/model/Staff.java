package model;

public class Staff extends Employee
{
	Staff()
	{
		super();
		System.out.println("this is in the grandchild class " + name);
	}
	
	Staff(String N, String A, double P, String E)
	{
		super(N, A, P, E);
	}
	
	
	public static void main(String[] args)
	{
		Staff St = new Staff();
		System.out.println("Name: " + St.name);
	}

}
