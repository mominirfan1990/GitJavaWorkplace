import java.util.Scanner;
public class numberOfDays 
/*
{

	public static void main(String[] args)
	{
	 int a;
	 Scanner sc;
	 sc=new Scanner(System.in);
	 System.out.println("Please Enter Month Number =" );
	 a= sc.nextInt();
	 
	 if (a <= 12 )
	 {
		 if(a==1)			 
			  System.out.println("Total Number of days in January is  31" );
			 
			 else if(a==2)			 
			   System.out.println("Total Number of days in Feb is 29" );
			 else if(a==3)				 
				   System.out.println("Total Number of days in March is 31" );
			 else if(a==4)				 
				   System.out.println("Total Number of days in April is 30" );
			 else if(a==5)
				   System.out.println("Total Number of days in May is 31" );
			 else if(a==6)				 
				   System.out.println("Total Number of days in June is 30" );
			 else if(a==7)				 
				   System.out.println("Total Number of days in Jully is 31" );
			 else if(a==8)				 
				   System.out.println("Total Number of days in August is 31" );
			 else if(a==9)				 
				   System.out.println("Total Number of days in Sep is 30" );
			 else if(a==10)				 
				   System.out.println("Total Number of days in Oct is 31" );
			 else if(a==11)				 
				   System.out.println("Total Number of days in Nov is 30" );
			 else if(a==12)				 
				   System.out.println("Total Number of days in Dec is 31" );
	 }
	 else 
		 System.out.println("Please Enter valid Month " );
	
}
}
*/


{

	public static void main(String[] args)
	{
	 int a;
	 Scanner sc;
	 sc=new Scanner(System.in);
	 System.out.println("Please Enter Month Number =" );
	 a= sc.nextInt();
	 
	 if (a <= 12 )
	 {
		 if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)			 
			  System.out.println("Total Number of days is  31" );
			 
			 else if(a==4 || a==6 || a==9 || a==11)			 
			   System.out.println("Total Number of days is 30" );
			 else if(a==2)				 
				   System.out.println("Total Number of days in Feb is 28 or 29" );
			 
			 
	 }
	 else 
		 System.out.println("Please Enter valid Month " );
	
}
}
