
public class paternFourteen
{
	   public static void main(String[] args)
	   
		{
		int i,j,k,row,sp,l= 1;
		row=4;
		sp=row-1;
		
		 for(i=1; i<=row; i++)
		 {
			 
			 for(k=1; k<=sp; k++)
			 {
				 System.out.print(" ");
			 }
			 for(j=1; j<=i; j++)
			 {
				 System.out.print(l);
				l++;
				 
			 }
			 
			 System.out.println();
		
			 sp--;
		 }
		 

		}
}



