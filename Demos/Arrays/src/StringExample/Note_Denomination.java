package StringExample;

import java.util.Scanner;

class Denomination
{ 
	int arr[]= {2000, 500, 200, 100, 50, 20, 10, 5, 1};
	int den[]=new int [1000];
	public void findDenomination(int amt)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{	
			while(amt>=arr[i])
			{
				if(amt>=arr[i])
				{
					amt=amt-arr[i];
					den[j]=arr[i];
					j++;
				}
				
			}
		}
		
		for(int i=0; den[i]!=0; i++)
		{
			int count=1;
			if(den[i]==den[i+1])
			{
				count++;
			System.out.println(den[i]+" "+count);
			i++;
			}
			else
				System.out.println(den[i]+" "+count);
		}
		
		
	}
}
public class Note_Denomination 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Ammount");
		int x =sc.nextInt();
		
		Denomination dm = new Denomination();
		dm.findDenomination(x);
	}

}
