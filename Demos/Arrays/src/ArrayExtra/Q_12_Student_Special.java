package ArrayExtra;

import java.util.Scanner;

class Student
{
	int id;
	String name;
	Course c;
	boolean special=false;
	
	Student()
	{
		
	}
	Student(String nam,int eid, Course c )
	{
		name= nam;
		id=eid;
		this.c=c;
	}
	public void displayStudent()
	{ 
		System.out.println("Student name "+name+"\n Student id "+id+"\n Course Details are "+c);
		if(c.fees>50000)
		{
			special = true;
			System.out.println("flag is "+special);
		}
	}
}
class Course
{
	String cname;
	int fees;
	Course(){}
	Course(String na, int fe)
	{
		cname=na;
		fees=fe;
	}
/*	public void displayCourse()
	{
		System.out.println("Course name "+cname+"\n Course fee "+fees);
	}
*/	public String toString()
	{
		String str;
		return str="Course name "+cname+"\n Course fee "+fees;
	}
}



public class Q_12_Student_Special 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[2];
		Course c = new Course();
		for(int i=0; i<st.length;i++)
		{
			
			System.out.println("Eneter Student name ");
			String name= sc.next();
			System.out.println("Eneter Student id ");
			int id = sc.nextInt();
			
				c=new Course();
				System.out.println("Eneter Course name ");
				String cs= sc.next();
				c.cname=cs;
				System.out.print("Eneter Course fees");
				int fee=sc.nextInt();
				c.fees=fee;
			st[i]=new Student(name,id,c);
		}
		for(Student ss:st)
		{
			ss.displayStudent();
		}
		
	}
}
