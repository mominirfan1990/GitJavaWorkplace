package ArrayAssignment_Home_1;
import java.util.Scanner;
public class Assign_15_Negative {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array ");
		int a[]= new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter element of array");
			a[i]=sc.nextInt();
			
		}
		System.out.println("\n Negative element of array are");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
