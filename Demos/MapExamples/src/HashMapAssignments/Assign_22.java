package HashMapAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



class Students
{
	int rollNo;
	String sname;
	Students()
	{}
	Students(int rn, String sn)
	{
		rollNo=rn;
		sname=sn;
	}
	public String toString()
	{
		return "\n Student rollNo = " + rollNo + ", name = " + sname ;
	}
	
}
class Deprtments
{
	int id;
	String dname;
	
	Deprtments()
	{
		
	}
	Deprtments(int id, String dn)
	{
		this.id=id;
		dname=dn;
		
	}
	public String toString()
	{
		return " Deprtment id = " + id + ", name = " + dname +"  ";
	}
	@Override
	public int hashCode()
	{
		return dname.hashCode()/id;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Deprtments dt = (Deprtments)obj;
		if(dt.id==this.id && dt.dname.equals(this.dname))
			return true;
		else
			return false;
		
	}
	
	
}
public class Assign_22
{
	ArrayList<Students> list1;
	ArrayList<Students> list2;
	ArrayList<Students> list3;
	ArrayList<Students> list4;
	Map<Deprtments,ArrayList<Students>>map;
	public void creatdepartm()
	{
		list1=new ArrayList<>();
		list1.add(new Students(10,"Ramesh"));
		list1.add(new Students(11,"Balaji"));
		list1.add(new Students(12,"Dhiraj"));
		list1.add(new Students(13,"Onkar"));
		
		list2=new ArrayList<>();
		list2.add(new Students(1,"Omkar"));
		list2.add(new Students(2,"Vishnu"));
		list2.add(new Students(3,"Sagar"));
		list2.add(new Students(4,"Nagesh"));
	
		list3=new ArrayList<>();
		list3.add(new Students(20,"Ganesh"));
		list3.add(new Students(21,"Irfan"));
		list3.add(new Students(22,"Snehal"));
		list3.add(new Students(23,"Kiran"));
		
		list4=new ArrayList<>();
		list4.add(new Students(30,"Vishal"));
		list4.add(new Students(31,"Deepak"));
		list4.add(new Students(32,"Geeta"));
		list4.add(new Students(33,"Prakash"));
		
		Deprtments do1= new Deprtments(101,"Electric");
		Deprtments do2= new Deprtments(202,"Mechanic");
		Deprtments do3= new Deprtments(303,"Computer");
		Deprtments do4= new Deprtments(101,"Electric");
	
		map=new HashMap<>();
		map.put(do1,list1);
		map.put(do2, list2);
		map.put(do3, list3);
		map.put(do4, list4);
		
	}
	public void iterateMap()
	{
		Set<Entry<Deprtments,ArrayList<Students>>>st= map.entrySet();
		Iterator<Entry<Deprtments,ArrayList<Students>>> itr= st.iterator();
		while(itr.hasNext())
		{
			Entry<Deprtments,ArrayList<Students>>et=itr.next();
			System.out.println(et.getKey());
			System.out.println(et.getValue());
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Assign_22 as = new Assign_22();
		as.creatdepartm();	
		as.iterateMap();
	}

}


