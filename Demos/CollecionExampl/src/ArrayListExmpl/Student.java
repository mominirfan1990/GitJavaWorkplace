package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;

public class Student 
{
	int eid, marks;
	String name; int max=0;
	ArrayList<Student> st1;
	
	Student()
	{
		
	}
	Student(int id, String nam, int mark)
	{
		eid=id;
		name=nam;
		marks=mark;
	}
/*	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(this==o)
			return true;
		Student obj = (Student)o;
		System.out.println(this.eid+"  "+obj.eid);
		if(this.eid==obj.eid && this.name.equals(obj.name) && this.marks==obj.marks)
		{
//			System.out.println(this.eid+"  "+obj.eid);
			return true;
		}
			
		else
			return false;
	}
*/	
	
	
	public void makeList()
	{
		st1= new ArrayList<>();
		st1.add(new Student(13,"Omkar",70));
		st1.add(new Student(14,"Vivek",55));
		st1.add(new Student(15,"Irfan",55));
		st1.add(new Student(16,"Sagar",67));
		
			
	}
/*	public void containsCheck()
	{
		System.out.println(st1.contains(new Student(12,"Irfan",67)));
	}

	public void highestMarks(ArrayList<Student> st1)
	{
		max=st1.get(0).marks;
		for(int i=1; i<st1.size(); i++)
		{
			if(st1.get(i).marks>max)
			{
				max=st1.get(i).marks;
			}
		}
		System.out.println("\n Heighest marks Student Recors  ");
		for(int i=0; i<st1.size(); i++)
		{
			if(st1.get(i).marks==max)
			{
				System.out.println("Student id "+st1.get(i).eid);
				System.out.println("Student name "+st1.get(i).name);
				System.out.println("Student marks "+st1.get(i).marks);

			}
		}

	}
*/	
	public void displayMethod()
	{
		for(int i=0; i<st1.size(); i++)
		{
			System.out.println("Student id "+st1.get(i).eid);
			System.out.println("Student name "+st1.get(i).name);
			System.out.println("Student marks "+st1.get(i).marks);
			System.out.println();
		}
//		highestMarks(st1);		
	}
	
	public static void main(String[] args)
	{
		Student sd = new Student();
		
		sd.makeList();
		sd.displayMethod();
		// sd.containsCheck();
		
		
	}

}
