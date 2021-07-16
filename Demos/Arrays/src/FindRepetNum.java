// find repetative number in array
import java.util.Scanner;

public class FindRepetNum {

	public static void main(String[] args) 
	{
		int a[]= {7,9,2,-3,4};
		
		for(int i = 0 ;i<a.length;i++)
		{
			int count =0;
			for(int j =0; j<a.length; j++)
			{
				if(a[i]==a[j] )
				{
					count++;
				}
				
			}
			System.out.println(a[i]+" Occures  "+count+" Times");
		}
		
	}

}
