package model;

public class Staff extends Employee
{
	//add title
	String title = "Communication Cordinator";
	
	
		
		
		
		//name = "grandchild";
		//address = "none I dont own house";
		//phNumber = 000.0000000;
		//eMail = "IgotNoEmail@silly.com";
		
		//System.out.println("this is in the grandchild class " + name);
	
	
	public Staff(String N, String A, double P, String E, String O, double S, String title)
	{
		super(N,A,P,E,O,S);
		this.setTitle(title);
		
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
	public static void main(String[] args)
	{
		Staff St = new Staff("Staff", "Staff Work Address", 801.73737, "Staff@email.com", "CEO", 219021.21, "Comm");
		System.out.println("Staff Tester: " + St.getName() + ", " + St.getAddress() + ", " + St.getPhNumber() + ", " + St.getEMail() + ", " + St.title);
	}

}
