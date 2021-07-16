//WAP to join two ArrayLists 
//WAP to clone an ArrayList to another ArrayList

package ArrayListAssignment;

import java.util.ArrayList;

public class Assign_33_34 {

	public static void main(String[] args) {
		ArrayList list,list1,list3;
		
		list= new ArrayList();
		list.add(66);
		list.add(33);
		list.add(44);
		list.add(11);
		
		list1=new ArrayList();
		list1.add("AA");
		list1.add("BB");
		list1.add("CC");
		list1.add("DD");
		
		list.addAll(list1); //join two ArrayLists
		System.out.println(list);
		
		list3=new ArrayList();
		list3.add(list.clone());//clone an ArrayList to another ArrayList
		System.out.println(list3); 

	}

}
