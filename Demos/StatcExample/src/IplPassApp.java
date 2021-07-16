import java.util.Scanner;
public class IplPassApp 
{
 public static void main(String[] args)
 {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter number of passess you want");
	 int a = sc.nextInt();
	 if(a<=20)
	 {
		 for (int i=a; i>0;i--)
		 {
			 IplPass p1= new IplPass();
			 p1.acceptDetials(a);
			 p1.PassCount();
			 System.out.println();
			 p1.availabePass();
			 System.out.println();
		 }
	 }
	 else
	 {
		 System.out.println("please Eneter valid number we have only 20 passes");
	 }
		 
	 }
}
