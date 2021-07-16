package inht_Multilevel_Example3;

public class HouseKeeping extends Vendor
{
	String clean,col,past,parkm;
	public void acceptDetailsHouse(String cl, String col, String past, String park)
	{
		clean = cl;
		this.col=col;
		this.past=past;
		parkm=park;
	}
	public void displayHouse()
	{
		System.out.println("House Keeping Workes for  ::"+clean+" "+col+" "+past+" "+parkm);
	}
}
