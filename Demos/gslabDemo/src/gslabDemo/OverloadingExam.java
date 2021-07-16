package gslabDemo;

public class OverloadingExam 
{
	int sum=0;
	float sum1=0;
	public void add(int a, int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	public void add(int a, float b)
	{
		sum1=a+b;
		System.out.println(sum1);
	}
	public static void main(String[] args) 
	{
		OverloadingExam ol= new OverloadingExam();
		ol.add(9, 12);
		ol.add(9, 12.5f);
	}

}
