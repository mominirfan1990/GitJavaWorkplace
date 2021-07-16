package ArrayListExmpl;

import java.util.ArrayList;

public class PalindromeArraylist 
{
	ArrayList<Integer>list;
	ArrayList<Integer>Nlist;
	public void findPalindrome()
	{
		list = new ArrayList<>();
		list.add(121);
		list.add(333);
		list.add(456);
		list.add(765);
		list.add(787);
		list.add(343);
		list.add(787);
		System.out.println("Input  List "+list);
/*		Nlist = new ArrayList<>();       // using 2nd list
		for(int i=0; i<list.size();i++)
		{
			int num = list.get(i);
			int reminder=0;
			int reverse=0;
			while(num!=0)
			{
				reminder = num%10;
				reverse= reverse*10+reminder;
				num/=10;
			}
			if(list.get(i)==reverse)
			{
				Nlist.add(list.remove(i));
				i--;
			}
		}
		if(Nlist.addAll(list));
			System.out.println(" Output list "+Nlist);
*/		int count=0;       // using single list
		for(int i=0; i<list.size()-count;i++)
		{
			int num = list.get(i);
			int reminder=0;
			int reverse=0;
			while(num!=0)
			{
				reminder = num%10;
				reverse= reverse*10+reminder;
				num/=10;
			}
			if(list.get(i)!=reverse)
			{
				list.add(list.remove(i)); // remove from index and add last index of list
				count++;
				i--;
			}
		}
		System.out.println("Output List "+list);
	}

	public static void main(String[] args)
	{
		PalindromeArraylist pt =new PalindromeArraylist();
		pt.findPalindrome();
	}

}
