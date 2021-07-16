package inht_Multilevel_Example1;

public class State extends Country
{
	String nam;
	int poplu;
	
	State(String nn, int pp)
	//public void acceptded(String nn, int pp)
	{
		super();
		nam= nn;
		poplu = pp;
	}
	public void display()
	{
		System.out.println("State name ::"+nam +"\n State population ::"+poplu);
	 show();
	}
}
