import java.util.Scanner;

class Signup
{
	int count=0;
	public void checkpass(String s) throws InvalidPAsswardException
	{
		char ch[]= s.toCharArray();
		if(ch.length>=8)
		{
			System.out.println("Sing up succesfully");
					
		}
		else 
			throw new InvalidPAsswardException("Invalid PAssward lenght must be greater than 8 ");
			
	}
}

public class ExceptionExam2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter password");
		String str= sc.next();
		try
		{
		 Signup sg= new Signup();
		 sg.checkpass(str);
		}
		catch(InvalidPAsswardException e)
		{
			e.showErr();;
		}
		sc.close();

		
		}

}
