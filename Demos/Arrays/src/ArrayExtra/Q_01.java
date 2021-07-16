package ArrayExtra;

public class Q_01   // outut is 10
{
	
		public static void main(String[] args)
		{
			int[] arr = { 1,2,23,42,3,5 };
			makenull(arr);
			System.out.println(arr[5]);
		}

		static void makenull(int[] arr)
		{
			arr[5] = 10;
			arr = null;
			System.out.print(arr+" ");
				
		}
	

}
