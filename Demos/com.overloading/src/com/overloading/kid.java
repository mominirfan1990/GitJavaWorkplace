package com.overloading;

public class kid
{

	public void readBook(int a)
	{
		System.out.println("readBook method having parameter and squre is = "+ (a*a));
	}
	
	public void readBook(int a, int b)
	{
		System.out.println("readBook method having parameter and addition is = "+(a+a));
	}

	
/*	class BigKid
	{
		public void readBook(int a, int b)
		{
			System.out.println("readBook method having parameter and addition is = "+(a+a));
		}
	}
*/
	
	
	public static void main(String[] args)
	{
		kid k =new kid();
		
		 k.readBook(4);
		 k.readBook(4,5);
	}

	


}



