import java.util.Scanner;
public class clothsbill 
{
	public static void main(String[] args)
	{
		int P=500, Q=0, Bill, Dis ;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Please Eneter Quantity of Shirts You want To Buy");
		Q= sc.nextInt();
		
		Bill=(P*Q);
		if (Bill<2000)
		{
		  if (Bill>=1000)
		  {
			Dis=(Bill*5)/100;
			System.out.println("You get 05% discount on Bill is ="+ Dis );
			Bill=Bill-Dis;
			System.out.println("You have to pay tatal Bill discount ="+Bill );
			System.out.println("Thanks Visit Again");
		  }
		  else
		  {
			System.out.println("Your Final bill is ="+Bill); 
			System.out.println("Thanks Visit Again");
		  }
		}
		else
		{
			Dis= (Bill*10)/100;
			System.out.println("You get 10% discount on Bill is ="+ Dis );
			Bill=Bill-Dis;
			System.out.println("You have to pay tatal Bill discount ="+Bill );
			System.out.println("Thanks Visit Again");
		}
		
	}
}
