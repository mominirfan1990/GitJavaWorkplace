import java.util.Scanner;
public class switchcase 
{

	public static void main(String[] args)
	{
		int p;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please eneter No of Participant");
		p= sc.nextInt();
		
		switch(p)
		{
		case 4: System.out.println("arrange car");
				break;
		case 5:
		case 6:
		case 7:
		case 8: System.out.println("arrange Enova");
				break;
		case 15: System.out.println("arrange travalr");
				break;
		case 20: System.out.println("arrange mini bus");
				break;
		case 30: System.out.println("arrange bus");
				break;
		default: System.out.println("please enter valid no");
				
		}
		
	}
}
