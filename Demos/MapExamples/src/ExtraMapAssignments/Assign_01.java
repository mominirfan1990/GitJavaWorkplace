package ExtraMapAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Studnt
{
	int id;
	String name;
	Studnt()
	{}
	Studnt(int id, String nm)
	{
		this.id=id;
		name=nm;
	}
	@Override
	public String toString() 
	{
		return "Student id=" + id + ", Student name=" + name;
	}
	
}
class Course
{
	String cname;
	Course(){}
	Course(String nam)
	{
		cname=nam;
	}
	public String toString()
	{
		return "Course name"+cname;
	}
}
public class Assign_01
{
	Map<Studnt,ArrayList<Course>>map;
	ArrayList<Course>list,list1;
	public void creatlist()
	{
		list=new ArrayList<>();
		list.add(new Course("JAVA"));
		list.add(new Course("SQL"));
		list.add(new Course("Python"));
		
		list1=new ArrayList<>();
		list1.add(new Course("C++ "));
		list1.add(new Course("DBA"));
		list1.add(new Course("SCALA "));
		
		Studnt st1= new Studnt(101, "Ganesh");
		Studnt st2= new Studnt(102, "Irfan");
		Studnt st3= new Studnt(103, "Vishal");
		Studnt st4= new Studnt(104, "Omkar");
		
		map=new HashMap<>();
		map.put(st1, list);
		map.put(st2, list1);
		map.put(st3, list);
		map.put(st4, list1);
		
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		Assign_01 as = new Assign_01();
		as.creatlist();

	}

}
