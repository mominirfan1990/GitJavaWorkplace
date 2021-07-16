package CompareAndComparatorExm;

import java.util.ArrayList;
import java.util.Comparator;

public class Students implements Comparable<Students>,Comparator<Students>
{
	int eid, marks;
	String name;
	Students() 
	{}
	Students(int id, String nam, int mark)
	{
		eid = id;
		name = nam;
		marks = mark;
	}
	public String toString()
	{
		return "\n Students eid=" + eid + ", marks=" + marks + ", name=" + name;
	}
	public int compareTo(Students o)
	{
		if (this.marks < o.marks)
			return -1;
		else if (this.marks > o.marks)
			return 1;
		else
		  return 0;
/*		 else
		return (this.name.compareTo(o.name)); // name ascending
		else if (this.name.compareTo(o.name) < 0) // by desecnding order
			return 1;
		else if (this.name.compareTo(o.name) > 0)
			return -1;
		else
			return 0;
*/	
	
	}
	public int compare(Students o1, Students o2) 
		{
			if(o1.marks<o2.marks)
				return -1;
			else if(o1.marks>o2.marks)
				return 1;
			else
				return (o1.name.compareTo(o2.name));
		}	
}
