package model;

public class Staff extends Employee
{
	//add title
	
	Staff()
	{
		super();
		//name = "grandchild";
		//address = "none I dont own house";
		//phNumber = 000.0000000;
		//eMail = "IgotNoEmail@silly.com";
		
		//System.out.println("this is in the grandchild class " + name);
	}
	
	public Staff(String N, String A, double P, String E)
	{
		super(N, A, P, E);
	}
	
	
	public static void main(String[] args)
	{
		Staff St = new Staff();
		System.out.println("Grandchild (aka Staff):" + " " + St.name + ", " + St.address + ", " + St.phNumber + ", " + St.eMail);
	}

}
