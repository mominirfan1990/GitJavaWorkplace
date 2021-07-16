
public class ClassTestOne
{
	public static void main(String[] args)
	{
	/*	Myloop:
			for(int j=0;j<3;j+=2)
			{
				System.out.println("j= " +j);
				for(int i=0; i<4;i++)
				{
					if(i==3)continue Myloop;
					if(i==3)break;
					System.out.println("i= " + i);
				}
				System.out.println("Outer for iterartion completed");
			}
	*/
		
		
		/*
		double sale =21000;
		double incentive = (sale<=10000)?0:(sale<=30000)?sale*0.05:(sale<=50000)?sale*0.08:sale*0.10;
		System.out.println("incentive earned is : "+ incentive);
	*/
		
	/*
		int cnt = 6;
		while(cnt-->2)
		{
			System.out.println(cnt);
		}
		
	*/
		
	/*
		int a=12,b=-8,c=2;
		System.out.println(a+a++ + --b* ++c);
		System.out.println("a =" + a+ "b=" + b +"c=" + c);
		System.out.println(c*26/a+c++ +c);
		System.out.println("a=" +a+"b="+b+"c="+c);
	*/
		
	/*	char ch = 'm';
		System.out.println((char)(++ch-32));
	*/
		
	/*	
		int i,j;
		for(i=4;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	*/
		
	/*	
		int i,no,rem,sum=0;
		
		no=345;i=3;
		for (i=3;i>0;i--)
		{
			rem=no%10;
			no=no/10;
			
			sum=sum+(int)(Math.pow(rem, i));
			
		}
		System.out.println(sum);
	*/
	/*	
		int a=345, rem, i, sum;
		 sum=0;
		
		for(i=3;i>0;i--)
		{
			rem = a%10;
			a=a/10;
			if(i==3)
			{
				sum=(rem*rem*rem);
			}
			else if (i==2)
			{
				sum= sum+(rem*rem);
			}
			else 
			{
				sum=sum+rem;
			}
		}
		
		System.out.println(sum);
		
	*/
		
		
		
	}
}
