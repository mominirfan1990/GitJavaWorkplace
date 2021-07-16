package ArrayAssignment_Home_1;
import java.util.Scanner;
public class Assign_12Comman_Elemet {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please eneter lenght of 1st array");
		int a[]=new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println(" Eneter " + i + " Element of 1st array");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Please eneter lenght of 2nd array");
		int b[]= new int[sc.nextInt()];
		for(int j=0; j<b.length; j++)
		{
			System.out.println("Enter "+ j+" Element of 2nd array");
			b[j]=sc.nextInt();
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		for(int y:b)
		{
			System.out.print(y+" ");
		}
		System.out.println("\n Comman element in both array are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}
