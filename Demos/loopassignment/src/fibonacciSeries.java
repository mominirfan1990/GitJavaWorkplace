//Fibbonacci series
public class fibonacciSeries
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		while(c<=100)
		{
			a=b;
			b=c;
			System.out.println(c);
			c=a+b;
		}
	}
}
