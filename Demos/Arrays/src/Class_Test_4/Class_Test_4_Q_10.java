package Class_Test_4;

import java.util.Scanner;

public class Class_Test_4_Q_10 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Number ");
		long num = sc.nextLong();
		long num1=num; 
		int count=1;
		long temp=0;
		while(num1/10!=0)  // find out length of enter number 
		{
			num1=(num1/10);
			count++;
		}
		
		int temparr[]=new int[count];
		int arr[]=new int[count];
		for(int i=temparr.length-1; i>=0;i--) // Separate digit from number and stored in temp array 
		{
			temp=num%10;
			temparr[i]=(int) temp;
			num=num/10;
			
		}
		
		arr[0]=temparr[0];
		int flag=0;int k=1;
		for(int i=1; i<temparr.length;i++) 
		{
			temp=temparr[i];
			for(int j=0;j<=i;j++)     // for checking double number
			{	
				flag=0;
				if(arr[j]==temp)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)           // stored number in array
			{
			arr[k]=(int) temp;
			k++;
			}
		}
		
		for(int i=0; i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


