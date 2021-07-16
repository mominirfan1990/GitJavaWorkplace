
import java.util.Scanner;


public class Occurance_by_SK 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter one number:");
			int no=sc.nextInt();
			int temp=no;
			int cnt=0;
			while(no>0)
			{
				int rem=no%10;
				cnt++;
				no=no/10;
				
			}
			
			int a[]=new int[cnt];
			int i=a.length-1;
			for(;temp>0;temp=temp/10)
			{
				int rem=temp%10;
					a[i]=rem;
					i--;
				
			}
			
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
			int check[]=new int[a.length];
			int s=0;
			myloop:
			for(int j=0;j<a.length;j++)
			{
				for(int h=0;h<check.length;h++)
				{
					if(a[j]==check[h])
					{
						continue myloop;
					}
				}
				int cnt1=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[j]==a[k])
						cnt1++;
				}
				
		    	System.out.println(a[j]+ " no occurs "+cnt1+" times");
		    	check[s]=a[j];
		    	s++;
								
				}
			
			
			
			
			}

		}

