// cooler is parent class of Airconditioner
package inhe_single_Exp1;

public class Cooler 
{
	String type,use;
	int num;
	
	
/*	public String toString()
	{
		String str;
		str= "Coolar type "+type+"  Cooler use "+use;
		return str;
	}
*/	
	//public void acceptDetails(String type, String use)
	public Cooler()     //default constructor
	{
		//this.type=type;
		//this.use=use;
		//this(23);
		type = "Air Cool";
		use= "Domestic";
		System.out.println("Parent class cooler defualt Constructor");
		//System.out.println("hascode of parent class default contr "+ this.hashCode());
	}
	public Cooler(int x)   //Parameterized constructor
	{
		
		num=x;
		System.out.println("Parent class Paremeteriesd constructor");
	}
	public void show()
	{
		System.out.println("Type of Cooler is ::"+type+"\n Area of using Cooler is ::"+use+" Number "+num);
	}

}
