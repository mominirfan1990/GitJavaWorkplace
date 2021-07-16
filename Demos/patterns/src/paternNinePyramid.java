
public class paternNinePyramid
{

	   public static void main(String[] args)
	   
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
		
			

		}
}
