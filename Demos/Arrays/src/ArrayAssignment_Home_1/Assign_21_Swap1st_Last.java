package ArrayAssignment_Home_1;
import java.util.Scanner;
public class Assign_21_Swap1st_Last {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter lenght of array");
		int z=sc.nextInt();
		int a[]= new int[z];
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enter "+ (i+1)+" Element of Array");
			a[i]= sc.nextInt();
		}
		System.out.println("\n Given Array");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n After swaping 1st and last Num ");
		System.out.println(" ");
		int temp = a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
