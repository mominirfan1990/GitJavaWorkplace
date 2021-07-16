//Association with containment aggregation with construct method
public class MyDate
{
	int d,m,y;
	
	MyDate()
	{
		d=1;
		m=1;
		y=1900;
	}
	MyDate(int dd, int mm, int yy)
	{
		d=dd;
		m=mm;
		y=yy;
	}
	
	public String toString()
	{
		String str;
		str=d+"/"+m+"/"+y;	
		return str;
		
	}
}
