import java.util.Scanner;
public class libraryFineTernary 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Book Issue Date");
		 int ID=sc.nextInt();
		System.out.println("Please Enter Book return Date");
		int RD=sc.nextInt();
		
		String f = ((RD-ID)>=15) ? ("Pay late fine" + (((RD-ID)-14)*50) ) : ("No Fine");
		System.out.println("You need to pay fine =" + f);
	}

}
