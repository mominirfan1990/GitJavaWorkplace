package ClassTestOnArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_4_ConvertArrylist 
{
	ArrayList <Integer> list;
	public void creatArrayList()
	{
		list= new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(44);
		list.add(55);
	}
	public void convertToArray()
	{
		Integer arr[]= list.toArray(new Integer[list.size()]);
		
/*		int i=0;
		int arr[]=new int[list.size()];   
		for(Integer x:list)
		{
			arr[i]=x;
			i++;
		}
*/		System.out.println("Array element");
		
		for(int xc:arr)
		{
			System.out.print(xc+" ");
		}
	}
	String name[]= {"Ram","Sham","Ganesh","Vishnu"};
	public void convertToArrayList()
	{
		ArrayList newNames = new ArrayList(Arrays.asList(name)); 
		
		ArrayList<String> newName1 = new ArrayList<>();
		for(int i=0; i<name.length; i++)
		{
			newName1.add(name[i]);
		}
		
		System.out.println(newNames);
		System.out.println(newName1);
		
				

	}
	public static void main(String...a)
	{
		Q_4_ConvertArrylist ca= new Q_4_ConvertArrylist();
		ca.creatArrayList();
		ca.convertToArray();
		ca.convertToArrayList();
	}
}
