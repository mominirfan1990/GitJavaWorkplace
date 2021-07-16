
public class Return_Even 
{
	static int count=0;
	public int [] getEven(int a[])
	{
		int evenNum[] = new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				evenNum[j]=a[i];
				j++;
				count++;
				
			}
			
		}
		return evenNum;
		
	}

	public static void main(String[] args)
	{
		int even[]= {2,3,5,4,7,8,9,6};
		Return_Even ed = new Return_Even();
		
		int newEven[] = ed.getEven(even);
		
		System.out.println("Even numbers are ::");
		
		for(int i=0; i<Return_Even.count;i++)   //call static variable of class Return_Even.
		{
			System.out.print(newEven[i] + " " );
			
		}
		
		
	}

}
