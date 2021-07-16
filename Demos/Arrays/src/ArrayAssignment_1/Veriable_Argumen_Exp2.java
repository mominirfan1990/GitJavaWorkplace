package ArrayAssignment_1;

public class Veriable_Argumen_Exp2 
{
	public void average(float...a)
	{
		float sum = 0;int count =0;
		for(int i=1; i<a.length;i++)
			{
				sum=(sum+a[i]);
				count++;
			}
			System.out.println("\n Average is "+(sum/count));
	
		
	}
	public static void main(String[] args)
	{
		float [] num= {1.2f,3,5.6f,87,23,15,99};
		Veriable_Argumen_Exp2 vre = new Veriable_Argumen_Exp2();
		vre.average(num);
	
	}

}
