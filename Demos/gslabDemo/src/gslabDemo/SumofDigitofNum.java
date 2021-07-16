package gslabDemo;

public class SumofDigitofNum {

	public static void main(String[] args) 
	{
		int a=153;
		int temp;
		int sum=0;
		while(a!=0)
		{
			temp=a%10;
			sum=sum+temp;
			a=a/10;
		}
		System.out.println(sum);
	}

}
