package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversion {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("ArrayList"+ list);
		
		// converting ArrayList to array method 1
/*		int i=0;
		int arr[]=new int[list.size()];   
		for(Integer x:list)
		{
			arr[i]=x;
			i++;
		}
		System.out.println("Array element");
		for(int xc:arr)
		{
			System.out.print(xc+" ");
		}
*/		
		// converting ArrayList to array method 2
		
		Integer newArr[]=list.toArray(new Integer[list.size()]); // list.toArray() method to convert ArrayList into Array
		for(int xc:newArr)
		{
			System.out.print(xc+" ");
		}
		
		// converts Array into ArrayList
		
		String name[]= {"Ram","Sham","Ganesh","Vishnu"};
		ArrayList newNames = new ArrayList(Arrays.asList(name)); // Arrays.asList() method to convert Array into ArrayList
		System.out.println(newNames);
	}

}
