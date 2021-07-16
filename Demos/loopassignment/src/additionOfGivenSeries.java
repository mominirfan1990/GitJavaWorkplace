

// addition of given series of no with previous no

import java.util.Scanner;
public class additionOfGivenSeries 
{
   public static void main(String[] args)
   {
	   int add=0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please Enter First No");
	   int  no1= sc.nextInt();
	   System.out.println("Please Enter Second No");
	   int  no2 = sc.nextInt();
	
	   
	   if(no2>no1)
	   {
		   while(no1<=no2)
		   {
			   add=add+no1;
			   no1++;
		   }
		   System.out.println(add);
	   }
	   else 
		   System.out.println("Please Renter no... No 2 should not be less than No1");
   }   
   }

