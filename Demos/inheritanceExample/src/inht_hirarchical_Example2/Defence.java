//defence is parent class of airforce , army, navy child class

package inht_hirarchical_Example2;

public class Defence
{
	String name,type, grade;
	int total;
	
	public void details(String na, String tp, String grd, int tot)
	{
		name = na;
		type = tp;
		grade= grd;
		total = tot;
	}
	public void displayDetails()
	{
		System.out.println("NAme of Country ::"+name+"\n Type ::"+type+"\n World wide rank ::"+grade+"\n Total Solder ::"+total);
	}
}
