package Assignment_On_Array;

import java.util.Scanner;


class NumbAvgn
{
	Scanner sc = new Scanner(System.in);
	public void arrange(int a[])
	{
		 int temp[]=new int[a.length];
		 int count=0;
		 for(int i=0; i<temp.length; i++)
		 {
			 System.out.println("Enter element of array ");
			 temp[i]=sc.nextInt();
			 if(temp[i]%3==0)
			 {
				 count++;
			 }
		 }
		 System.out.println(count);
		 int j=0;
		 if(count>0)
		 {
			 for(int i=0;i<temp.length;i++)
			 {
				 if(temp[i]%3==0 )
				 {
					 a[j]=temp[i];
					 j++;
				 }
				 else
				 {
					 a[count]=temp[i];
					 count++;
				 }
			 }
			 System.out.println(" Sorted Array by sign ");
			 for(int x:a)
			 {
				 System.out.print(x+" ");
			 }
			
		 }
		 System.out.println("No number divisible by 3");
		}


	}

public class Assign_15_Arrange_Neg_Positve {

	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter lenght of array");
	 int lenght = sc.nextInt();
	 int a[]=new int[lenght];
	 
	 NumbAvgn num = new NumbAvgn();
	 num.arrange(a);
	}
}
