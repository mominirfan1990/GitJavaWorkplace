// 1 to 100 number whoes digit substarction is 4 or -4

public class numberDiff4 
{

	public static void main(String[] args)
	{
		int n=10,rem, div,res;
		
		while(n<99)
		{
			rem=n%10;
			div = n/10;
			res = rem-div;
			
			
			if(res== 4 || res== -4)
			{
				System.out.println(n);
			}
			n++;
		}
	}
}
