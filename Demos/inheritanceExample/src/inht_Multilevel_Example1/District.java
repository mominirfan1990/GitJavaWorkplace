package inht_Multilevel_Example1;

public class District extends State
{
	String namm;
	int popl;
	
	District(String n1, int p1)
	//public void acceptdedd(String n1, int p1)
	{
		super ("Maharashtra ",70000);
		namm= n1;
		popl = p1;
	}
	public void displayDetails()
	{
		System.out.println("District name ::"+namm +"\n District population ::"+popl);
	 this.display();
	}

}
