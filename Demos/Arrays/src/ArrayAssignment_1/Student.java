package ArrayAssignment_1;

public class Student
{
	int roll,m;
	String name;
	Student()
	{
		
	}
	
	Student(String na, int rol, int m)
	{
		roll=rol;
		this.m=m;
		name=na;
	}
	
	public String toString()
	{ 
		String str= "roll no "+roll+" marks "+m+" name "+name;
		return str ;
		
	}
	public static void main(String[] args)
	{
		Student  s[];
		s= new Student[5];
	 for(Student stt: s)
	 {
		 System.out.print(stt+" ");
	 }
	}
}
