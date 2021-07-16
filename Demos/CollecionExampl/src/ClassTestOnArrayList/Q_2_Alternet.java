package ClassTestOnArrayList;

import java.util.ArrayList;

import ArrayListExmpl.AlternetElem;

public class Q_2_Alternet
{
		ArrayList<Integer>list1,list2,list3;

		public void alternetElemnet()
		{
			list1=new ArrayList<>();
			list1.add(4);
			list1.add(5);
			list1.add(10);
			list1.add(3);
			list1.add(4);
			
			list2=new ArrayList<>();
			list2.add(11);
			list2.add(17);
			list2.add(0);
			list2.add(11);
			list2.add(14);
			list2.add(9);
			list2.add(2);
			list2.add(17);
			
			list3 = new ArrayList<>();
			for(int i=0; i<list2.size();i++)
			{
				if(list1.size()>i)
				{
					if(i%2==0)
					{
						list3.add(list1.get(i));
					}
					else if(i%2==1)
					{
						list3.add(list2.get(i));
					}
				}
				else
				{
					list3.add(list2.get(i));
				}
			}
			System.out.println(list3);
		}
		public static void main(String[] args)
		{
			Q_2_Alternet am= new Q_2_Alternet();
			am.alternetElemnet();
		}

	}


