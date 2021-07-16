//Association with containment aggregation with construct method
public class Department
{
	int id;
	String name;
	
	Department()
	{
		id = 112;
		name = "Electronics";
	}
	
	Department(int a, String b)
	{
		id = a;
		name = b;
	}
	
	public String toString()
	{
		String str;
		str = "Department name :: "+name+"\n  Department id ::"+ id;
		return str;
	}
	
	
}
