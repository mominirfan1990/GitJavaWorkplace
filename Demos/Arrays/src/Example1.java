import java.util.Scanner;

public class Example1 
{
	 
	public static void main(String[] args)
	{
		int i;
		float sum=0.0f;
		float []a= new float [7];
		Scanner sc = new Scanner(System.in);
		System.out.println("please select lenght");
		Scanner size = new Scanner(System.in);
		int sz= size.nextInt();
		for(i=0; i<sz; i++)
		{
			System.out.println("eneter value");
			a[i]= sc.nextFloat();
			sum=sum+a[i];
		}
		for( i=0;i<sz;i++)
		{
			System.out.print(a[i]+" ");	
		}
		System.out.println(  );
		System.out.println("total is :: "+sum);		
		System.out.println("avarage is ::"+ (sum/sz));  
		
	}
}
