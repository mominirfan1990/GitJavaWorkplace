package com.overloading;

public class Semester
{

	int math,phy,chem;
	double percentage;
	
	Semester()
	{
		math= 70;
		phy = 80;
		chem = 60;
		percentage= (math+phy+chem)*0.3;
	}
	
	Semester (int a, int b, int c)
	{
		math = a;
		phy = b;
		chem = c;
		percentage =(math+phy+chem)*0.3; 
	}
	
	
	public void Display()
	{
		System.out.println("Math marks ::"+ math);
		System.out.println("Chem marks ::"+chem);
		System.out.println("phy marks  ::"+phy);
		System.out.println("Total percentage ::"+percentage);
		
	}
	
}
