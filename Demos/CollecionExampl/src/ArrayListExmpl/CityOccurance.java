package ArrayListExmpl;

import java.util.ArrayList;
import java.util.Collections;

public class CityOccurance 
{
	int count = 0;
	int k = 0;
/*	public void findOccurance(ArrayList s)  // without using function
	{
		for (int i = 0; i < s.size(); i++) {
			count = 0;
			for (int j = 0; j < s.size(); j++) {
				if (s.get(i).equals(s.get(j))) {
					count++;
				}
			}
			System.out.println(s.get(i) + " Occurce " + count);
		}

	}
*/
	public void findOccurance(ArrayList s) // using function
	{
		ArrayList<String> checkArr = new ArrayList<>();
		for(int i=0; i<s.size();i++)
		{
			if(!checkArr.contains(s.get(i)))
			{
				int count= Collections.frequency(s, s.get(i));
				System.out.println(s.get(i)+" Occurce "+count);
				checkArr.add((String) s.get(i));
			}
		}
		
	}
	public void findMaxOccurance(ArrayList list)
	{
		int max=1;int ct=0;
		for(int i=0; i<list.size(); i++)
		{
			if((Collections.frequency(list, list.get(i)))>max)
			{
				max=Collections.frequency(list, list.get(i));
				ct=i;
			}
			
		}
		System.out.println("Maximun Occurance City is "+list.get(ct)+" Occured at "+max +" Times");
	}
	
	public void findMinimunOccurence(ArrayList list)
	{
		int min=1; 
		for(int i=0;i<list.size();i++)
		{
			if((Collections.frequency(list, list.get(i)))<=min)
			{
				System.out.println("Minimum Occurance City is "+list.get(i)+" Occured at "+min +" Times");
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<String> nm = new ArrayList<>();
		nm.add("pune");
		nm.add("mumbai");
		nm.add("pune");
		nm.add("nashik");

		CityOccurance co = new CityOccurance();
	//	co.findOccurance(nm);
		co.findMaxOccurance(nm);
		co.findMinimunOccurence(nm);
	}

}
