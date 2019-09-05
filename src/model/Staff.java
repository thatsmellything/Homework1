package model;

public class Staff extends Employee
{
	//add title
	String title = "Communication Cordinator";
	
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
		title = title;
	}
	
	
	public static void main(String[] args)
	{
		Staff St = new Staff("Staff", "Staff Work Address", 801.73737, "Staff@email.com");
		System.out.println("Staff Tester: " + St.name + ", " + St.address + ", " + St.phNumber + ", " + St.eMail + ", " + St.title);
	}

}
