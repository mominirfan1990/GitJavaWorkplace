import java.util.Scanner;

public class MaxNumInArray {
	
	public void FindMAxNum(int a[])
	{
		for(int i=0; i<(a.length-1); i++)
		{
			for(int j=0; j<(a.length-1-i);j++)
			{
				if(a[j]<a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int z :a)
		{
			System.out.print(z+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int lnght= sc.nextInt();
		int arr[] = new int[lnght];
				for(int i=0; i<=lnght-1; i++)
				{
					System.out.println("Please enter " +(i+1)+" number ");
					arr[i]=sc.nextInt();
				}
		
				MaxNumInArray mx = new MaxNumInArray();
				mx.FindMAxNum(arr);
		
		//int a[]= {1,5,3,2};
		 
	}

}
