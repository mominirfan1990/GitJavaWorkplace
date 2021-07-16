import java.util.Scanner;

public class Example {
	 static int price= 50;
	public static void main(String[] args)
	{
		int a[]=new int [10];
		int i,sum=0,total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Eneter How many people you want to sale ticket  ");
		int size = sc.nextInt();
		for (i=0; i<size;i++)
		{
		System.out.println("Please eneter How many ticket you want");
		a[i]= sc.nextInt();
		System.out.println("You pay amount "+a[i]*price+ " for "+a[i]+" Tickets");
		}
		for (i=0; i<size;i++) 
		{
			sum = sum+a[i];
					
		}
		System.out.println();
		System.out.println("Total " + sum +" ticket Sold for "+size+" Peoples");
		
		total=(sum*price);
		System.out.println("Total Collection "+total+ " Rs");
		
	}

}
