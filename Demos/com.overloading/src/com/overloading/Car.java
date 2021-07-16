// Contructor

package com.overloading;

public class Car 

{

	int regno, avg;
	String model;
	
	Car()      //default constructor its dot have parameter 
	{
		regno = 4567;
		avg = 23;
		model = "Maruti";
	}
	

	
	 Car ( int rg, int av , String md)  // parameter constructor .. its initialize by parameter
	{
		regno = rg;
		avg = av;
		model = md;
	}
	
	public String toString()
	{
		String str;
		str="Reg No :"+ regno + "\n Average : "+ avg + "\n model : "+model;
		return str;
		
	}
	
	
	public static void main(String[] args)
	{
		Car mz = new Car();
		System.out.println(mz);
		
		Car santro = new Car(12345, 24,"Hundai");
		System.out.println(santro);
				
	}
	
}
