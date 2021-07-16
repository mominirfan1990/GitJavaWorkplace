import java.util.Scanner;
public class character 
{
	public static void main(String[] srgs) {
	char X;

	Scanner sc;
	sc= new Scanner(System.in);
	System.out.println("Please Eneter Character = ");
	X=sc.next().charAt(0);
	sc.close();
	System.out.println("Enetered character is "+ X);
	//System.out.println("Enetered Character Aski value is" + (int)X); // typecast character in to interger to show aski value
	
	
	if (X >= 'a' &&  X <= 'z')
	{
		//System.out.println("Enetered Characters is Small Alphabet");
		System.out.println("Entered character Capital is="+(char)(X-32)); // typecast character X-32 is for capital
	}
	else if (X >= 'A' && X <='Z')
	{
		//System.out.println("Enetered Characters is Capital Alphabet");
		System.out.println("Entered character Small is="+(char)(X+32));  // typecast character x+32 is for small
	}
	else
	{ 
		System.out.println("Eneterd Character is not Alphabet");
	}
	
}
}
	