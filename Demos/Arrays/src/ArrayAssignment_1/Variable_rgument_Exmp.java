package ArrayAssignment_1;


public class Variable_rgument_Exmp 
{
	public void addition(int...a)
	{
		int temp=a[0];
			for(int i=1; i<a.length;i++)
			{
				if(a[i]>temp)
				{
					temp =a[i];
				}
			}
			System.out.println("\n largest number is "+temp );
	
		
	}
	public static void main(String[] args)
	{
		int [] num= {12,3,56,87,23,15,99};
		Variable_rgument_Exmp vre = new Variable_rgument_Exmp();
		vre.addition(num);
	
	}

}
