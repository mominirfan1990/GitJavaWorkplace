package com.overloading;

public class PolyCompileExamp
{
	
/*
	public void add(int a,int b)
	{
	 System.out.println("Addition of (int , int )is = "+ (a+b));
	}
	public float add(int a, float b)
	{
		return (a+b) ;
	}
	public void add(float a, float b)
	{
		System.out.println("Addition is = "+ (a+b));
	}
	public void add(String a, String b)
	{
		System.out.println("Full name  is = "+ (a+ " " +b));
	}
	
	public void add(byte a,byte b)
	{
	 System.out.println("Addition of (byte , byte) is = "+ (a+b));
	}
	public void add(char a, char b)
	{
		System.out.println("Addition of (char ,char) is "+ (a + b));
	}


*/
	
	
	 public void add(int a, int b)
	 {
		 System.out.println("Area of Rectangle is  " + (a*b));
	 }
	 public void add(int a)
	 {
		 System.out.println("Area of Square is =" + (a*a));
	 }
	 public float add(float a)
	 {
		 return (float)(2*3.13*a*a);
	 }
	 public float add(float a, float b)
	 {
		 return ((a*b)/2);
	 }
	 
	 
	public static void main(String[] args)
	{
		PolyCompileExamp p= new PolyCompileExamp();
	/*  p.add("Think","Quotient");
		//p.add((byte)4,(byte)5);
		
		p.add(4,5);
		
		System.out.println("Addition of float and int is = " + p.add(4,9.8f));
		p.add(5.6f,8.6f);
		p.add('a', 'b');
		p.add(12, (char)97);
	*/
		p.add(4,9);
		p.add(4);
		System.out.println("Area of Tiangle = "+ p.add(4f, 6f));
		System.out.println("Area of Circle =" + p.add(4f));
		
		
		
	}

}