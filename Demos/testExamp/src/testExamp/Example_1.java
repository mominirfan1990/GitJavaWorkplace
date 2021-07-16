package testExamp;
// two array, 1st array int, {5,6,22,11,23,9,2}, 2nd array {3,15,7,6}.
//3rd array consists of alternate element {5,3,6,15,22,7,11,6,23,9,2}
//	3,5,15,6,7,22,6,11,23,9,2
public class Example_1 
{
	int arr2[]= {5,6,22,11,23,9,2};
	int arr1[]= {3,15,7,6};
	int arr3[]= new int[arr1.length+arr2.length];
	int k=0;int j=0;
	public void createArray()
	{
		for(int i=0; i<arr3.length;)
		{
			if( j<arr2.length)
			{
				arr3[i]=arr2[j];
				j++;
				i++;
			}
			else if( k<arr1.length )
			{
				arr3[i]=arr1[k];
				k++;
				i++;
			}
			
		}
		for(int x:arr3)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) 
	{
		Example_1 ep = new Example_1();
		ep.createArray();
	}

}
