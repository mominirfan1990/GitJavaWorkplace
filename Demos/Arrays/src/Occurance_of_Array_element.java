import java.util.Scanner;

class Numbers
{
	int num,count=1,temp=0,flag=0;
	int arr[];
	
	public void acceptNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number ");
		int no =sc.nextInt();
		num=no;
		temp=num;
		while(temp/10!=0)
		{
			temp=temp/10;
			count++;
		}
		arr=new int [count];
		for(int i=0;i<arr.length;i++)
		{
			temp=no%10;
			no=no/10;
			arr[arr.length-1-i]=temp;
		}
	}
	public void displayArray()
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public void occurance ()
	{
		
	/*	for(int i=0;i<arr.length;i++)
		{	
			temp = arr[i];count=0;
			for(int j=0;j<arr.length;j++)
			{	
				if(temp==arr[j])
				{
					count++;
				}
			}
			System.out.println("\n"+arr[i]+" occurs "+ count +" times");
		}
		
	*/	
		for(int i=0; i<arr.length;i++)
		{
			temp=arr[i];count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				  count++;
				  
				}
			}
			System.out.println("\n"+arr[i]+" "+count);
		}
		
	}
	
}



public class Occurance_of_Array_element 
{
	public static void main(String[] args) 
	{
		Numbers or =new Numbers();
		or.acceptNumber();
		or.displayArray();
		or.occurance();
	}
}
