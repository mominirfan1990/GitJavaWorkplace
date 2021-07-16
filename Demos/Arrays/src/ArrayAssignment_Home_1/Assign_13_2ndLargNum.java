package ArrayAssignment_Home_1;
import java.util.Scanner;
public class Assign_13_2ndLargNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int a[]=new int [sc.nextInt()];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter "+i+" element of array");
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp =a[i];
			}
		}
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=temp && a[i]>min)
			{
				min=a[i];
			}
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n 2nd largest number is "+ min);
	}

}
