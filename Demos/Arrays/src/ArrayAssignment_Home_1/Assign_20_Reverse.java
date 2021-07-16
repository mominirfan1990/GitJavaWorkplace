package ArrayAssignment_Home_1;

public class Assign_20_Reverse {

	public static void main(String[] args) 
	{
		int a[]= {7,0,0};
		int b[]=new int [a.length];
		for(int i=0; i<a.length;i++)
		{
			b[a.length-1-i]=a[i];
		}
		for(int x:a)
		{System.out.print(x+" ");}
		System.out.println();
		for(int y:b)
		{System.out.print(y+" ");}
	}

}
