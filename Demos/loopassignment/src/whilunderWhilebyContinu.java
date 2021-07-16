
public class whilunderWhilebyContinu 
{
	public static void main(String[] args)
	{
		
	int i=0,j=0;
	Myloop:
	while(i<=2)
	{
		i++; j=0;
		System.out.println("Turn No is = " +i);
		
		while(j<=4)
		{
			j++;
			if(j==3)
				continue Myloop;    // used continued to skip no 3 to print also used loop name its terminate hole while loop
			
				System.out.println(j);
			
		}
		System.out.println("Turn complited");
		System.out.println("\n");
		
	}
	}

}


/*
output of programm is

Turn No is = 1
1
2
Turn No is = 2
1
2
Turn No is = 3
1
2
*/