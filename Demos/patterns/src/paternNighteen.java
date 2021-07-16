
public class paternNighteen 
{

	public static void main(String[] args)
	{
	
		{
		int i,j,t,k,row=5,sp,l=1,ro=row-1;
	
	sp=row-1;
			
		 for(i=1; i<=row; i++)
		 {
			 for(k=1; k<=sp; k++)
			 {
				 System.out.print(" ");
			 }
			 for(j=1; j<=i; j++)
			 {
				 System.out.print("*"+" ");
			 }
			 
			 System.out.println();
			 l++;
			 sp--;
			 
		 
		 }
		 
		 
	
		 for(i=1;i<=row-1;i++)
		 {
			 for(k=row-1;k>=sp;k--)
			 {
				 System.out.print("");
			 }
			 for(j=row-1;j>=i;j-- )
			 {
				 System.out.print("* " );
				 
			 }
			 System.out.println();
			 
		 }
		
			

	}

}
}
