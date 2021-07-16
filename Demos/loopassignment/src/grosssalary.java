
import java.util.Scanner;
public class grosssalary


{

	public static void main(String[] args)
	{
		
		 int Basic,hra,da,Total;
		 Scanner sc;
		 sc=new Scanner(System.in);
		 System.out.println("Please Enter Basic salary of Employee =" );
		 Basic= sc.nextInt();
		 		
		 if (Basic >= 10000 )
		 {
		  		
		  		hra =( (Basic*25)/100);
		  		da =( (Basic*35)/100);
		  		Total = (Basic + hra +da);
	
		  	
		  		
			  System.out.println("Congratualtions you get_" + Total+ "_salary" );
			 
			   	   
   		 
		 }
		 else
			 System.out.println("Please Reenter Valid Salary " );

	}
}
