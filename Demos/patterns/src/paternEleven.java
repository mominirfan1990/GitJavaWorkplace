
public class paternEleven 
{

	   public static void main(String[] args)
	   
		{
		int i,j,k,row,sp,l= (char)'A',m=(char)'A';
		row=5;
		sp=row-1;
		
		 for(i=1; i<=row; i++)
		 {
			 l='A';
			 for(k=1; k<=sp; k++)
			 {
				 System.out.print(" ");
			 }
			 for(j=1; j<=i; j++)
			 {
				 System.out.print((char)l);
				l++;
				 
			 }
			 
			 System.out.println();
		
			 sp--;
		 }
		 

		}
}
