
public class ArryToStoreFirstTenPrimeNum {
	public static void main(String[] args)
	{
		int count=0;
		int a [] = new int [10];
	
		for(int i=1;i<50;i++)
		{
			 if( i>=2 && i%2!=0 || i==2)
			 {
				 a[count]=i;
				 count++;
			 }
			 if(count==10)
					break;
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	
	}

}
