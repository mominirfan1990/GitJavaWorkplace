package ArrayAssignment_1;

public class Veriabl_Argument_Exmp3
{
	public void findString(String a[],String...b)
	{
		for(int i=0; i<b.length;i++)
		{
			if(a[0].equals(b[i]))
			{
				System.out.println("Availabe String in both array is :: "+a[0]+ "\n at "+(i+1)+"Location");
			}
		}
			
	}
	public static void main(String[] args)
	{
		String a[]= {"irfan"};
		String b[]= {"sagar", "vikas", "omkar", "irfan", "ganesh"};
		Veriabl_Argument_Exmp3 vr = new Veriabl_Argument_Exmp3();
		vr.findString(a, b);
	}

}
