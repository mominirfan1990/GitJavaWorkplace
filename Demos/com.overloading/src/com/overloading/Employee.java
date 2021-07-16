// constructor example for employee class

package com.overloading;

public class Employee

{

	String  name;
	int basic,eid;
	double gross;
	
	Employee()       // defualt constructor
	{
		name = "irfan momin";
		eid= 102;
		basic = 10000;
		gross= (basic+ (basic*0.20) + (basic*0.35));
	}
	
	
	Employee (String n, int b, int id)  // parameterized constructor
	{
		name= n;
		basic = b;
		eid = id;
		gross= (basic+ (basic*0.20) + (basic*0.35));
	}
	
	
	public String toString()
	{
		String str;
		str= "name of employee :: "+ name + "\n employee eid ::"+ eid + "\n Gross salary ::" + gross;
		return str;
	}
	
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee ("Ashish ", 12000, 103);
		System.out.println(e2);
	}
}
