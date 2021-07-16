package Example6;

public class MAin {

	public static void main(String[] args) 
	{
		SalCal sc= new Intern();
		
		sc.CalStipend();
		((Intern)sc).display();
	}

}
