
public class patternSevn {

	public static void main(String[] args)
	{
	int i,j,k,l,row,sp;
	row=7;
	sp=row-1;
	 
	/*
	 * for(i=1; i<=row; i++)
	 {
		 for(k=1; k<=sp; k++)
		 {
			 System.out.print(" ");
		 }
		 for(j=1; j<=i; j++)
		 {
			 System.out.print(" *");
					 
		 }
		 System.out.println();
		 sp--;
	 }

	}
	*/

	for(i=1;i<=row;i++)
	{
		if(i==1 || i==4)
		{
			System.out.println(" ******");
		}
		else
			System.out.println("*      *");
	}
	
}
}
