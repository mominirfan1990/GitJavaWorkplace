
import java.util.Scanner;
public class percentageusingifelse


{

	public static void main(String[] args)
	{
		
		 int Math, Physics, Chemistry, Total, Marks;
		 Scanner sc;
		 sc=new Scanner(System.in);
		 System.out.println("Please Enter Maths Marks =" );
		 Math= sc.nextInt();
		 
		 System.out.println("Please Enter Physics Marks =" );
		 Physics= sc.nextInt();
		 
		 System.out.println("Please Enter Chemistry Marks =" );
		 Chemistry= sc.nextInt();
		
		 Marks = (Math + Physics + Chemistry);
		 
		 System.out.println("Your Total Marks  =" + Marks + "_"+"out of 300");
		 
		 Total = ((Marks*100)/300);
		 System.out.println("Your Total % Marks  =" + Total + "%");
		 
		
		 if (Total > 40 )
		 {
		   if(Total >= 80)
			 
			  System.out.println("Congratualtions you get distinction" );
			 
			 else if(Total >70 && Total <=80)
			 
			    	 System.out.println("Congratualtions you get 1st class" );
		   
			 else if (Total > 60 && Total <= 70)
			 System.out.println("Congratualtions you get 2st class" );
		   
			 else if (Total > 40 && Total <= 60)
				 System.out.println("Congratualtions you get Pass class" );
			  	     
   		 
		 }
		 else
			 System.out.println("Sorry you are fail " );

	}
}