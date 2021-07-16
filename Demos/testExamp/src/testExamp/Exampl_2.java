package testExamp;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// student class id, name, marks,couse c. course class id, name , fees
//hashet of student objects , remove all less than 30 marks
//map <fees,count of studnt>.

class Course
{
	int cId;
	String cName;
	float cFees;
	public Course() {}
	public Course(int cId, String cName, float cFees) 
	{
		this.cId = cId;
		this.cName = cName;
		this.cFees = cFees;
	}
	public String toString() 
	{
		return "Course [cId=" + cId + ", cName=" + cName + ", cFees=" + cFees + "]";
	}
	
}
class Student
{
	int sId;
	String sName;
	int mArks;
	Course c;
	public Student() {}
	public Student(int id, String nm, int mk, Course c) 
	{
		sId=id;
		sName=nm;
		mArks=mk;
		this.c=c;
	}
	public String toString()
	{
		return "Student [sid=" + sId + ", sname=" + sName + ", marks=" + mArks + ", c=" + c + "]";
	}
	@Override
	public int hashCode()
	{
		return sName.hashCode()/sId;
	}
	@Override
	public boolean equals(Object o)
	{	
		if(o==null)
			return false;
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		
		Student st=(Student)o;
		if(st.sId==this.sId && st.sName==this.sName)
			return true;
		else
			return false;
	}
}
public class Exampl_2 
{
	HashSet<Student>hst;
	Map<Float,Integer>map;
	int count=1;
	public void createHashSet()
	{
		hst=new HashSet<>();
		
		Course c1= new Course(90, "java", 3000);
		Course c2= new Course(91, "SQL", 2000);
		Course c3= new Course(92, "jdbc", 2000);
		Course c4= new Course(93, "HTML", 4500);
		
		Student s1= new Student(101,"Irfan",25,c1);
		Student s2= new Student(102,"Vishal",30,c2);
		Student s3= new Student(103,"Sneha",45,c2);
		Student s4= new Student(104,"Vishnu",65,c1);
		Student s5= new Student(105,"Omkar",50,c1);
		Student s6= new Student(106,"WEFG",50,c3);
		Student s7= new Student(101,"Irfan",25,c1);
		Student s8= new Student(107,"Vaibhav",40,c4);
		
		hst.add(s1);
		hst.add(s2);
		hst.add(s3);
		hst.add(s4);
		hst.add(s5);
		hst.add(s6);
		hst.add(s7);
		hst.add(s8);
		
		map=new HashMap<>();
		Iterator<Student>itr= hst.iterator();
		int count1=1;
		while(itr.hasNext())
		{
			Student sd= itr.next();
			if(!map.containsKey(sd.c.cFees))
			{
				map.put(sd.c.cFees,count1);
			}
			else if(map.containsKey(sd.c.cFees))
			{
				Integer cnt=map.get(sd.c.cFees);
				map.put(sd.c.cFees,++cnt);
			}
		}
		
		System.out.println(map);
	/*		
		// remove record whos marks less than 30
		Iterator<Student> ss= hst.iterator();
		while(ss.hasNext())
		{
			if(ss.next().mArks<30)
				ss.remove();
		}
		
	
	*/
		for(Student x:hst)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) 
	{
		Exampl_2 exp= new Exampl_2();
		exp.createHashSet();
	}

}


