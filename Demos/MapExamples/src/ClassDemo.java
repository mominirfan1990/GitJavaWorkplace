import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 

class Student
{
	int id;
	String name;
	String hobbie;
	
	Student(){}
	Student(int id, String name, String hob)
	{
		this.id=id;
		this.name=name;
		hobbie=hob;
	}
	public String toString()
	{
		return "Student id"+id+" Student name "+name+" Hobbie "+hobbie;
	}
}
public class ClassDemo
{
	List<Student>list;
	List<String>list1;
	Map<String, List>map;
	public void creatList()
	{
		list=new ArrayList<>();
		
		Student st= new Student(1,"Irfan","reading");
		Student st1=new Student(2,"Vishal","reading");
		Student st2= new Student(3,"Sneha","Traveling");
		Student st3= new Student(3,"Deepak","Traveling");
		Student st4= new Student(3,"Ganesh","reading");
		
		list.add(st);
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		map=new HashMap<>();
		for(int i=0; i<list.size(); i++)
		{
			list1=new ArrayList<>();
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i).hobbie.equals(list.get(j).hobbie))
				{
					if(!list1.contains(list.get(i).name))
					{
						list1.add(list.get(j).name);
					}
				}
			}
			map.put(list.get(i).hobbie,list1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		ClassDemo cd =new ClassDemo();
		cd.creatList();
	}

}
