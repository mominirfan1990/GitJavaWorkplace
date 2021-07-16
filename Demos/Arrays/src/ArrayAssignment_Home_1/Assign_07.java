package ArrayAssignment_Home_1;

class calcAverage
{
	 
	public static int average(int [] array)
	{
		int avg1=0;
		for (int i=0; i<array.length; i++)
		{
			avg1=(avg1+array[i]);
		}
		avg1= (avg1/array.length);
		return avg1;
	}
	public static double average(double[] array)
	{
		double avg2=0;
		for (int i=0; i<array.length; i++)
		{
			avg2=(avg2+array[i]);
		}
		avg2= (avg2/array.length);
		return avg2;	}
}

public class Assign_07 {

	public static void main(String[] args) 
	{
	 int a[]= {1,2,3,4,5,6};
	 double b[] = {6.0,3.4,6.4,1.2,4.0};
	 System.out.println("Average of interger Array is ::"+ calcAverage.average(a));
	 System.out.println("Average of Double Array is ::"+ calcAverage.average(b));
	}

}
