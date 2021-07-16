package CompareAndComparatorExm;

import java.util.Comparator;

public class Employed implements Comparator<Employed>
{
	int salary;
	String name,deprt;
	Employed(){}
	Employed(String nam, String dep, int sal)
	{
		name=nam;
		deprt=dep;
		salary=sal;
	}
	public String toString()
	{
		return "\n Name  "+name+"   Department  "+deprt+"   Salary  "+salary;
	}
	public int compare(Employed o1, Employed o2) 
	{
		if(o1.salary<o2.salary)
			return -1;
		else if(o1.salary>o2.salary)
			return 1;
		else 
			return(o1.deprt.compareTo(o2.deprt));
	}
	
	
}
