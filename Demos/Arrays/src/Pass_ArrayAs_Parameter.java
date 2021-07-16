// pass array and print in reveres order 
class PassArray
{	
/*	public void display(int a[]) //  receive array and print in order
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void displayReverse(int a[])  // receive array and print in reverse order
	{
		System.out.println();
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
*/
	public void modified(int a[]) 
	{
		for(int i=0; i<a.length; i++)
		{
			a[i]+=1;  // same as a[i]=a[i]+1
		}
	}

}

public class Pass_ArrayAs_Parameter
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		
		PassArray obj= new PassArray();  // creat object of class
		
	//	obj.display(arr);  // pass array by name only" and called display method 
		
	//	obj.displayReverse(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		obj.modified(arr);
		System.out.println("After modification");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
