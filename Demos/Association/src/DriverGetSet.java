//Association with containment aggregation with get set method
public class DriverGetSet 
{
	private int age, licno;
	private String name;
 
	public void setAge(int q)
	{
		age=q;
	}
	public void setLicno(int s)
	{
		licno=s;
	}
	public void setName(String t)
	{
		name= t;
	}
	public int getAge()
	{
		return age;
	}
	public int getLicno()
	{
		return licno;
	}
	public String getName()
	{
		return name;
	}
	
	public void TakeRTOExam()
	{
		System.out.println("Driver has passed RTO Exam");
	}
	
	public String toString()
	{
		String str;
		str="Driver dtailsa are  "+"\n Name of driver  :: "+ name +"\n licenece no  :: "+licno+"\n Driver age ::"+ age;	
		return str;
		
	}


}
