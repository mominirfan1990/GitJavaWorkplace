
import java.util.Scanner;
public class electricitybill
{

	public static void main(String[] args)
	{
	 double bill,charges,units;
	 Scanner sc;
	 sc=new Scanner(System.in);
	 System.out.println("unit =" );
	 units= sc.nextInt();
	 
	 if (units <=50 )
	 {
		charges=units*0.5;

		 System.out.println("Your Electricity Bill is "+ (charges+(charges*20/100)));
	 }
	else if (units <= 100)
	{
		bill= units-50;
	
	     charges =(bill*0.75)+0.5*50;
		 System.out.println("Your Electricity Bill is "+ (charges+(charges*20/100)));
	}
	else if (units <= 250)
	{
		bill= units-150;
	
			     charges =(bill*1.20)+0.5*50+0.75*100;
				 System.out.println("Your Electricity Bill is "+ (charges+(charges*20/100)));	 
	}
	else if (units >= 250)
	{
		bill= units-250;
	
			     charges =(bill*1.0)+0.5*50+0.75*100+1.20*100;
				 System.out.println("Your Electricity Bill is "+ (charges+(charges*20/100)));	 
	}
	}
}
