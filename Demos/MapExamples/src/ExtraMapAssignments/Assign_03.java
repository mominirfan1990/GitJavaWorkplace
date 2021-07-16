package ExtraMapAssignments;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student1
{
	int sid;
	String sname,city;
	float aggregateMarks;
	Student1(){}
	Student1(int id, String nam, String city, float mark)
	{
		sid=id;
		sname=nam;
		this.city=city;
		aggregateMarks=mark;
	}
	@Override
	public String toString() 
	{
		return "\n Student id=" + sid + ", name=" + sname + ", city=" + city + ", aggregateMarks=" + aggregateMarks;
	}
	
}
public class Assign_03 
{
	ArrayList<Student1>list,list2;
	Map<Float,ArrayList<Student1>>map;
	public void creatList()
	{
		Student1 st= new Student1(11,"Omkar","Pune",60.56f);
		Student1 st1=new Student1(12,"Vishal","Nashik",60.56f);
		Student1 st2=new Student1(13,"Ganesh","Mumbai",60.56f);
		
		Student1 st3=new Student1(14,"Irfan","Satara",76.5f);
		Student1 st4=new Student1(4, "Rajasi","Pune",76.5f);
		Student1 st5=new Student1(10,"Mayur","Sangali",76.5f);
		
		list=new ArrayList<>();
		list.add(st);
		list.add(st1);
		list.add(st2);
		
		list2=new ArrayList<>();
		list2.add(st3);
		list2.add(st4);
		list2.add(st5);
		
		map= new HashMap<>();
		map.put(st.aggregateMarks, list);
		map.put(st3.aggregateMarks, list2);
		
		
		Set <Float>str1= map.keySet();
		Iterator<Float>itr=str1.iterator();
		while(itr.hasNext())
		{
			Float ft= itr.next();
			System.out.println(ft);
			System.out.println(map.get(ft));
			
		}
	}
	public static void main(String[] args)
	{
		Assign_03 as= new Assign_03();
		as.creatList();

	}

}
