package CompareAndComparatorExm;

import java.util.Arrays;
import java.util.Comparator;

class Sort implements Comparator<Integer>
{

	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}
public class MyClass {

	public static void main(String...a) 
	{
		Integer intArray[] = {2,3,1};
		Arrays.sort(intArray, new Sort());
		for(int i:intArray)
		{
			System.out.print(i+" ");
		}
	}

}
