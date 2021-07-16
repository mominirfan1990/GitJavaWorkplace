// print hello by its turn 1


public class whileundrWhile
{
	public static void main(String[] args)
	{
	int i=0,j=0;
	
	while(i<=2)
	{
		i++; j=1;
		System.out.println("Turn No is = " +i);
		
		while(j<=i)
		{
			System.out.println("hello");
			j++;
		}
		
	}
	}
}
	
	
	/* Out put of program is
	  Turn No is = 1
	 
	hello
	Turn No is = 2
	hello
	hello
	Turn No is = 3
	hello
	hello
	hello
	
	*/


