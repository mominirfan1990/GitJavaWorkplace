package com.overloading;

public class SemApp
{
	public static void main(String[] args)
	{
		Semester s1 = new Semester();
		s1.Display();
		
		System.out.println();
		
		Semester s2 = new Semester(78,97,85);
		s2.Display();
		System.out.println("hashcode for s2   "+s2);
		
		System.out.println();
		
	//	Semester s3 =  s2 ; // not creat seperate memory in heap only get refernce address
		
		Semester s3 = new Semester();     // its creat new object s3 and creat new memory at heap
		s3.chem=s2.chem;					// its copy s2 object data to s3 object 
		s3.math=s2.math;
		s3.phy=s2.phy;
		s3.percentage=s2.percentage;
		
		System.out.println("hashcode for s3   "+s3);
		s3.Display();
	}
}
