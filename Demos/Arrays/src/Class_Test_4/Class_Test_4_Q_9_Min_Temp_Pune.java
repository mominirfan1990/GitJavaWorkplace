package Class_Test_4;

import java.util.Scanner;

public class Class_Test_4_Q_9_Min_Temp_Pune 
{
	Scanner sc = new Scanner(System.in);
	
	public void acceptDetails(int b[])
	{
		for(int i=0; i<b.length;i++)
		{
			System.out.println("Eneter Pune city "+(i+1)+"/03/2020 Temperature");
			b[i]=sc.nextInt();
		}
	}
	public void displayDetails(int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			System.out.print((i+1)+"/03/2020 Temp is ::"+"  ");
			System.out.println(+a[i]+" °c");
		}
	}
	public void minimumTemp(int a[])
	{
		int min=a[0];int count=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i]; 
				count=(i+1);
			}
		}
		System.out.println("Minimum Temperature of Pune city During Month at "+ count+"/03/2020   "+min  +" °c");
	}
	
	public static void main(String[] args)
	{
		int temp[]=new int[5];
		Class_Test_4_Q_9_Min_Temp_Pune pt = new Class_Test_4_Q_9_Min_Temp_Pune();
		pt.acceptDetails(temp);
		pt.displayDetails(temp);
		pt.minimumTemp(temp);
	}
}
