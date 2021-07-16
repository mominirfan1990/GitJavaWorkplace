
import java.util.Scanner;
public class grosssalarybyslab 


{

	public static void main(String[] args)
	{
		
		 int Basic,hra,da,Total;
		 Scanner sc;
		 sc=new Scanner(System.in);
		 System.out.println("Please Enter Basic salary of Employee =" );
		 Basic= sc.nextInt();
		 		
		 if (Basic <= 20000)
		 {
			 if(Basic >10000)
			 {
				 hra =( (Basic*25)/100);
				 da =( (Basic*90)/100);
		  		 Total = (Basic + hra +da);
		  		 System.out.println("Congratualtions you get_" + Total+ "_salary" );
			 }
			 else if(Basic <=10000)
			 {
				 hra =( (Basic*20)/100);
				 da =( (Basic*80)/100);
		  		 Total = (Basic + hra +da);
		  		 System.out.println("Congratualtions you get_" + Total+ "_salary" ); 
			 }
   		 
		 }
		 else
			 {
			 hra =( (Basic*30)/100);
			 da =( (Basic*95)/100);
			 Total = (Basic + hra +da);
			 System.out.println("Congratualtions you get_" + Total+ "_salary" );
			 }

	}
}
