package ExtraMapAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assign_02 
{
	public static void main(String[] args) 
	{
		Integer arr[]= {3,4,5,2,3,5,1};
		ArrayList<Integer>list=new ArrayList(Arrays.asList(arr));
		ArrayList<Integer>list1=new ArrayList<>();
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int j=0; j<list.size();j++)
		{
			int temp=(Collections.frequency(list, list.get(j)));
			if(temp>1)
			{
				map.put(list.get(j), temp);
			}
			
		}
		System.out.println(map);	
	}

}
