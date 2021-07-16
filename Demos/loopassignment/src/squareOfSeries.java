// square of given series no.

import java.util.Scanner;
public class squareOfSeries
{
  public static void main(String[] args)
  {
/*	  int no1,no2,cnt,square;                   //(using 4 veriable)
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter Start no ");
	  no1= sc.nextInt();
	  cnt=no1;
	  System.out.println("Enter End no");
	  no2= sc.nextInt();
	  
	  while(cnt<=no2)
	  {
		  square = no1*no1;
		 System.out.println("Square of Give no is" + square);
		 no1++;
		 cnt++;
	  }

*/
	  
	  int no1,no2;                   //(using 2 veriable)
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter Start no ");
	  no1= sc.nextInt();
	  System.out.println("Enter End no");
	  no2= sc.nextInt();
	  
	  while((no1*no1)<=(no2*no2))
	  {
		 
		 System.out.println("Square of Give no is" + (no1*no1));
		 no1++;
		 
	  }

  }
}


