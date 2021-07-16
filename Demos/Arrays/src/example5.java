//Square of array
import java.util.Scanner;

public class example5 
{
	public static void main(String[] args)
	{
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Eneter lenght of array ");
			int size = sc.nextInt();
			int b[]= new int [size];
			int a[]=new int[size];
			for(int i=0; i<size; i++)
			{
				System.out.println("Eneter number");
				a[i]=sc.nextInt();
				a[i]= (a[i]*a[i]);
				
			}
			for(int i=0; i<size; i++)
			{
			System.out.print(a[i]+"  ");
			}
		}
			
	}

}
