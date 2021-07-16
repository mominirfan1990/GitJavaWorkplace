
public class whilUndrWhilbyContinue 
{
	public static void main(String[] args)
	{
		
	int i=0,j=0;
	
	while(i<=2)
	{
		i++; j=0;
		System.out.println("Turn No is = " +i);
		
		while(j<=4)
		{
			j++;
			if(j==3)
				continue;    // used continued to skip no 3 to print
			System.out.println(j);
			
		}
		System.out.println("Turn complited");
		System.out.println("\n");
		
	}
	}

}


/*  output of program
 
 Turn No is = 1
1
2
4
5
Turn complited


Turn No is = 2
1
2
4
5
Turn complited


Turn No is = 3
1
2
4
5
Turn complited

 */