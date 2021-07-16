//amstrong number

import java.util.Scanner;
public class amstrongnumber
{
 public static void main(String[] args)
 {
	 int res=0, temp, c=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter number");
	 int no= sc.nextInt();
	 temp=no;
	 
	 while(no>0)
	 {
		res =no%10;
		no=no/10;
		c=(c+(res*res*res));
		
	 }
	 if (temp==c)
	 {
		 System.out.println("Given number is Amstrong Number");
	 }
	 else
		 System.out.println("Given number is not Amstrong Number");
 }
}
