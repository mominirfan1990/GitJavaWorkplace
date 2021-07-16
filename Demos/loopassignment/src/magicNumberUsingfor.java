import java.util.Scanner;

public class magicNumberUsingfor
{
   public static void mai(String[] args)
   {
	   int num,i,diff; 
	   int magicnumber = 55;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please enter number");
	   num=sc.nextInt();
	   
	   for (i=0 ; i>7; i++ )
	   {
		   diff=magicnumber-num;
		   if (diff> 4 || diff < -4)
		   {
			   System.out.println("Please Renter Number");
		   }
		   else if (diff <4 || diff >-4)
		   {
			  System.out.println("You are near to logic number please renter number"); 
		   }
		   else if (diff == 0)
		   {
			   System.out.println("You got a Logic Number");
		   }
			   
	   }
	   System.out.println("Sorry you are out of trial");
   }
   
	
}
