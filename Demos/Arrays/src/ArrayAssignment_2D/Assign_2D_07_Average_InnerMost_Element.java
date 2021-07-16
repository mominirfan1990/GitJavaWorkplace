package ArrayAssignment_2D;
import java.util.Scanner;
public class Assign_2D_07_Average_InnerMost_Element
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number of rows and colum ");
		int rc = sc.nextInt();
		int arr[][]=new int[rc][rc];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				System.out.println("Eneter "+ i+" Row "+j+" Coloum Elementof 2D-Matrix");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enetered Matrix is ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		float avg=0; int cnt=0;
		System.out.println("Inner most element of Matrix are ");
		for(int i=1;i<arr.length-1;i++)
		{
			for(int j=1; j<arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
				avg=(avg+arr[i][j]);
				cnt++;
			}
			System.out.println();
		}
		avg=(avg/cnt);
		System.out.println("Average of inner most element of matrix is ::"+avg);
	}
}
