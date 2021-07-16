package ExtraMapAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign_04 {

	public static void main(String[] args) 
	{
		String str="Good Morning";
		Character arr[]=new Character[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i]=str.charAt(i);
			
		}
		
		ArrayList<Character>list=new ArrayList(Arrays.asList(arr));
		Map<Character, Integer>map=new HashMap<>();
		for(int j=0; j<list.size();j++)
		{
			if(list.get(j)!=32)
			{
				int temp=Collections.frequency(list, list.get(j));
				map.put(list.get(j), temp);
			}
		}
		System.out.println(str);
		System.out.println(map);
	}

}
