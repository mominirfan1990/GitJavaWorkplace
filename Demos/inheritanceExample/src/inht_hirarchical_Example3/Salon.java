package inht_hirarchical_Example3;

public class Salon
{
	String fac,dos,cut,col; 
	
	Salon()
	{
		fac= " Spa";
		dos= " masag";
		cut= " Hair cutting";
		col= " hair coloring";	
	}
	Salon(String f,String d,String c,String cl)
	//public void accept(String f,String d,String c,String cl)
	{
		fac = f;
		dos= d;
		cut=c;
		col=cl;
	}
	
	public void display()
	{
		System.out.println("Salon have" +" -"  +fac+ " -"+" -"+dos+ " -"+cut+ " - "+"hair"+ col+" -Facalities availabe");
	}
}
