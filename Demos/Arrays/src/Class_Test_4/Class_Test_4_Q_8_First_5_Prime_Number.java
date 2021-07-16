package Class_Test_4;

public class Class_Test_4_Q_8_First_5_Prime_Number 
{
	public static void main(String[] args)
	{
		int count=0;
		int a [] = new int [5];
	
		for(int i=1;i<20;i++)
		{
			 if( i>=2 && i%2!=0 || i==2)
			 {
				 a[count]=i;
				 count++;
			 }
			 if(count==5)
					break;
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	
	}
}
