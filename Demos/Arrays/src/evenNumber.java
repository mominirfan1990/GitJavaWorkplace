import java.util.Scanner;

public class evenNumber {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Eneter lenght of array ");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("Eneter number");
			a[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Even Numbers are ");
		for(int i=0;i<size;i++)
		{
			if (a[i]%2==0)
			{
				System.out.print( a[i]+"  ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("Total even numbers "+count);
		
	}

}
