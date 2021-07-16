package Class_Test_6;

class AverageM
{
	public void calAverage(int a[][])
	{
		System.out.println("\n Given MAtrix is ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		float ravg =0;
		for(int i=0; i<a.length; i++)
		{
			ravg=0;
			for(int j=0; j<a[i].length; j++)
			{
				ravg = (ravg+a[i][j]);
			}
			ravg=(ravg/(a.length+1));
			System.out.println("Average of "+(i+1)+" Row is "+ravg);
		}
		float cavg =0;
		for(int j=0; j<a.length+1; j++)
		{
			cavg=0;
			for(int i=0; i<a.length; i++)
			{
				cavg = (cavg+a[i][j]);
			}
			cavg=(cavg/a.length);
			System.out.println("Average of "+(j+1)+" Coloum is "+cavg);
		}
	}
}
public class Q_3_Average_of_Row_Colum {

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3,7},
					{4,5,6,8},
					{9,7,8,5}};
		AverageM av = new AverageM();
		av.calAverage(a);
	}

}
