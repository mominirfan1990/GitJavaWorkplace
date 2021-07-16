package inht_Multilevel_Example1;

public class Village extends District
{
	String namee;
	int poplul;
	
	Village()
	{
		super ("Satara ", 50000);
		namee= "koregon";
		poplul= 40000;
	}
/*	public void acceptd1(String n2, int p2)
	{
		namee= n2;
		poplul = p2;
	}
*/
	public void display1()
	{
		System.out.println("Village name ::"+namee +"\n Village population ::"+poplul);
		this.displayDetails();
	}
	
	public static void main(String[] args)
	{
		Village v1= new Village();
		//v1.accept("India", 1500000000);
		//v1.acceptded("Maharashtra", 1200000);
	//	v1.acceptdedd("Satara", 800000);
	//	v1.acceptd1("Koregaon", 40000);
		v1.display1();
	}

}
