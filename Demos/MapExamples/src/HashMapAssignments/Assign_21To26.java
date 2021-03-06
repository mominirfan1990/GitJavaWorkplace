package HashMapAssignments;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student
{
	int rollNo;
	String sname;
	Student()
	{}
	Student(int rn, String sn)
	{
		rollNo=rn;
		sname=sn;
	}
	public String toString()
	{
		return "\n Student rollNo = " + rollNo + ", name = " + sname ;
	}
	
}
class Deprtment
{
	int id;
	String dname;
	ArrayList<Student> st;
	Deprtment()
	{
		
	}
	Deprtment(int id, String dn, ArrayList<Student> st)
	{
		this.id=id;
		dname=dn;
		this.st=st;
	}
	public String toString()
	{
		return " Deprtment id = " + id + ", name = " + dname +"  "+  st ;
	}
	
}
public class Assign_21To26 
{
	ArrayList<Student> list1,list2,list3,list4;
	Map<Integer,Deprtment>map;
	public void creatdepartm()
	{
		list1=new ArrayList<>();
		list1.add(new Student(10,"Ramesh"));
		list1.add(new Student(11,"Balaji"));
		list1.add(new Student(12,"Dhiraj"));
		list1.add(new Student(13,"Onkar"));
		
		list2=new ArrayList<>();
		list2.add(new Student(1,"Omkar"));
		list2.add(new Student(2,"Vishnu"));
		list2.add(new Student(3,"Sagar"));
		list2.add(new Student(4,"Nagesh"));
	
		list3=new ArrayList<>();
		list3.add(new Student(20,"Ganesh"));
		list3.add(new Student(21,"Irfan"));
		list3.add(new Student(22,"Snehal"));
		list3.add(new Student(23,"Kiran"));
		
		list4=new ArrayList<>();
		list4.add(new Student(30,"Vishal"));
		list4.add(new Student(31,"Deepak"));
		list4.add(new Student(32,"Geeta"));
		list4.add(new Student(33,"Prakash"));
		
		Deprtment do1= new Deprtment(101,"Electric",list1);
		Deprtment do2= new Deprtment(202,"Mechanic",list2);
		Deprtment do3= new Deprtment(303,"Computer",list3);
		Deprtment do4= new Deprtment(404,"Production",list4);
	
		map=new HashMap<>();
		map.put(do1.id,do1);
		map.put(do2.id, do2);
		map.put(do3.id, do3);
		map.put(do4.id, do4);
		
	}
	public void iterateMap()
	{
		Set<Entry<Integer,Deprtment>>st= map.entrySet();
		Iterator<Entry<Integer,Deprtment>> itr= st.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Deprtment>et=itr.next();
			System.out.println(et.getValue());
		}
	}
	public static void main(String[] args) 
	{
		Assign_21To26 as = new Assign_21To26();
		as.creatdepartm();	
		as.iterateMap();
	}

}
