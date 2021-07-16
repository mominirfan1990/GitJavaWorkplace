package com.overloading;

public class SemsterConsrtct 
{
 
	int phy, chem, math; double  percntg;
	String name,desg;
	
	SemsterConsrtct()
	{
		name = "IRFAN";
		phy = 98;
		chem = 87;
		math = 67;
		percntg = (phy+chem+math)*0.3;
	
		
	//this(68,78,56,"omkar"); // "this" used for calling one constructor from other 
	
	
	}
	
	SemsterConsrtct(int p, int c, int m,String n)
	{
		
		
		name = n;
		phy = p;
		chem = c;
		math = m;
		percntg = (phy+chem+math)*0.3;
	}

	
/*	
	SemsterConsrtct(int phy, int chem, int math,String name)   // shodoing of loacal verial on instatnt verible due to same varible name to avoid "this"
	{
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
		percntg = (phy+chem+math)*0.3;
	}
*/	
/*	public String toString()   // toSting method used when we dont write display method ... if dont writen to string mehod then its output is hashcode
	{
		String str;
		str= "Name :: "+ name +"\nPhysics marks :: "+ phy + "\n Chemistry marks ::"+ chem + "\n Mathematic marks ::" + math + "\n percentage ::" + percntg;
		return str;
	}
*/	
	
	public void certificatePAss(String a)
	{
		System.out.println("Passing Certificate");
		this.Display();      //  "this" is used for refer object
	}
	
	
	
	public void Display()
	{
		System.out.println("name ::"+ name);
		System.out.println("Physics ::"+phy);
		System.out.println("Chemistry :: "+ chem);
		System.out.println("MAths  ::" + math);
		System.out.println("Percentage : "+ percntg);
		
	}
	
	
	public static void main(String[] args)
	{
		SemsterConsrtct e1 = new SemsterConsrtct();
		System.out.println(e1);
		e1.Display();
		
		SemsterConsrtct e2 = new SemsterConsrtct(68,78,56,"omkar");
		System.out.println(e2);
		e2.Display();
		//e2.certificatePAss();
		
	}

}
