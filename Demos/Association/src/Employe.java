 //Association with containment aggregation with construct method
public class Employe 
{

	int eid;
	String name;
	MyDate jd,ad;
	
	public Employe()
	{
		eid =100;
		name = "Ash";
		jd= new MyDate(25,02,2020);
		ad = new MyDate(25,02,2021);
	}
	
	public Employe(int a, String b, MyDate d1, MyDate d2)
	{
		eid= a;
		name = b;
		jd = d1;
		ad= d2;
	}
	
	public void display()
	{
		System.out.println(" Employee Details are "+"\n Name ::"+ name+ "\n Eid ::"+eid+"\n Joining date  ::"+ jd+"\n Apprisal Date  ::"+ad);
	}
}
