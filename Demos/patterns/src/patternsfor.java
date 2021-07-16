// for loop with break and continue 

public class patternsfor
{

	public static void main(String[] args)
	{
		myloop:
		for(int i=0;i<=2;System.out.println("Reinitialization" + i))
		{
			i++;
			for(int j=0;j<=2;j++)
			{
				if (j==1)
					continue myloop; // 
					//break myloop;  //
				System.out.println("j = "+j);
				
			}
			
			//System.out.println("i = "+ i);
		}
	}
}
